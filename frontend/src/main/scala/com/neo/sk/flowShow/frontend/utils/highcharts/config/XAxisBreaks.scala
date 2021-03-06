/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.neo.sk.flowShow.frontend.utils.highcharts.config

import scalajs.js, js.`|`
import com.neo.sk.flowShow.frontend.utils.highcharts.CleanJsObject
import com.neo.sk.flowShow.frontend.utils.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>xAxis-breaks</code>
  */
@js.annotation.ScalaJSDefined
class XAxisBreaks extends js.Object {

  /**
    * A number indicating how much space should be left between the start and the end of the break. The break size is given in axis units, so for instance on a <code>datetime</code> axis, a break size of 3600000 would indicate the equivalent of an hour.
    * @since 4.1.0
    */
  val breakSize: js.UndefOr[Double] = js.undefined

  /**
    * The point where the break starts.
    * @since 4.1.0
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * Defines an interval after which the break appears again. By default the breaks do not repeat.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-repeated/">Repeated Break</a>
    * @since 4.1.0
    */
  val repeat: js.UndefOr[Double] = js.undefined

  /**
    * The point where the break ends.
    * @since 4.1.0
    */
  val to: js.UndefOr[Double] = js.undefined
}

object XAxisBreaks {
  /**
    * @param breakSize A number indicating how much space should be left between the start and the end of the break. The break size is given in axis units, so for instance on a <code>datetime</code> axis, a break size of 3600000 would indicate the equivalent of an hour.
    * @param from The point where the break starts.
    * @param repeat Defines an interval after which the break appears again. By default the breaks do not repeat.
    * @param to The point where the break ends.
    */
  def apply(breakSize: js.UndefOr[Double] = js.undefined, from: js.UndefOr[Double] = js.undefined, repeat: js.UndefOr[Double] = js.undefined, to: js.UndefOr[Double] = js.undefined): XAxisBreaks = {
    val breakSizeOuter: js.UndefOr[Double] = breakSize
    val fromOuter: js.UndefOr[Double] = from
    val repeatOuter: js.UndefOr[Double] = repeat
    val toOuter: js.UndefOr[Double] = to
    new XAxisBreaks {
      override val breakSize: js.UndefOr[Double] = breakSizeOuter
      override val from: js.UndefOr[Double] = fromOuter
      override val repeat: js.UndefOr[Double] = repeatOuter
      override val to: js.UndefOr[Double] = toOuter
    }
  }
}
