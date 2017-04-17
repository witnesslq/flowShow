package com.neo.sk.flowShow.core

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.stream.OverflowStrategy
import akka.stream.scaladsl.{Flow, Sink, Source}
import org.slf4j.LoggerFactory

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext
import com.neo.sk.flowShow.Boot.receiveDataActor
import com.neo.sk.flowShow.core.ReceiveDataActor._
import com.neo.sk.flowShow.ptcl.{Heartbeat, WebSocketMsg, ComeIn, GetOut}
import com.neo.sk.utils.SecureUtil
import akka.actor.PoisonPill

import scala.collection.mutable

/**
  * Created by dry on 2017/4/5.
  */
trait WebSocketActor {

  def buildCode(): Flow[String, WebSocketMsg, Any]
}

object WebSocketActor {

  private[this] val log = LoggerFactory.getLogger(getClass)

  private val dataActorMap: mutable.HashMap[String, ActorRef] = mutable.HashMap()

  def create(system: ActorSystem)(implicit executor: ExecutionContext): WebSocketActor = {

    val actorId = System.nanoTime() + SecureUtil.nonceStr(6)

    val dataWsActor = system.actorOf(Props(new Actor {

      private[this] val id = actorId

      private[this] var subscriber: ActorRef = _

      val heartbeatTick = context.system.scheduler.schedule(5.seconds, 5.seconds, self, Tick)

      override def preStart(): Unit = {
        log.info(s"$log starts.")
      }

      override def postStop(): Unit = {
        log.info(s"$log stops.")
        heartbeatTick.cancel()
      }

      override def receive: Receive = {

        case RegisterWebsocket(out) =>
          log.debug("产生一个websocket链接" + out)
          subscriber = out
          receiveDataActor ! Subscribe(out)

        case DeleteWebsocket(out) =>
          log.debug("断开一个websocket 链接" + out)
          dataActorMap.remove(actorId)
          receiveDataActor ! UnSubscribe(out)
          self ! PoisonPill

//        case RealTimePersonNumberAdd(groupId, list) =>
//        //TODO  每隔5分钟应该产生一个数据推送到前端

        case Tick =>
          subscriber ! Heartbeat(id = "heartbeat")

//        case ComeIn(floor:String) =>
//          log.info(s"people come in: $floor")
//          subscriber ! ComeIn(floor)
//
//        case GetOut(floor:String) =>
//          log.info(s"people get out: $floor")
//          subscriber ! GetOut(floor)

        case Handle(msg) =>
          log.info(s"$id got msg $msg.")

        case x@_ =>
          log.info(s"got unknown msg: $x")
      }

    }))

    dataActorMap.put(actorId, dataWsActor)

    new WebSocketActor {
      override def buildCode(): Flow[String, WebSocketMsg, Any] = {
        val in =
          Flow[String]
            .map( msg => Handle(msg))
            .to(Sink.actorRef[InnerMsg](dataWsActor, DeleteWebsocket))

        val out =
          Source.actorRef[WebSocketMsg](5, OverflowStrategy.dropHead)
            .mapMaterializedValue(outActor => dataWsActor ! RegisterWebsocket(outActor))

        Flow.fromSinkAndSource(in, out)
      }
    }
  }


  private trait InnerMsg

  private case class RegisterWebsocket(out: ActorRef) extends InnerMsg

  private case class DeleteWebsocket(out: ActorRef) extends InnerMsg

  private case class NewMacNewMac(groupId:String,mac:String) extends InnerMsg

  private case class LeaveMac(groupId:String,mac:Iterable[String]) extends InnerMsg

  private case class Handle(msg: String) extends InnerMsg

  private case object Tick extends InnerMsg

}
