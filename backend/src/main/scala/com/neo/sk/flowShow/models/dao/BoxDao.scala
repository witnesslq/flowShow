package com.neo.sk.flowShow.models.dao

import com.neo.sk.flowShow.models.SlickTables._
import com.neo.sk.utils.DBUtil.db
import slick.jdbc.PostgresProfile.api._

/**
  * Created by whisky on 17/4/14.
  */
object BoxDao {

  def listDistributedBoxs = db.run(
    tBoxs.result
  )

}