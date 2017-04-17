package com.neo.sk.flowShow.models.dao

import com.neo.sk.flowShow.common.Constants
import com.neo.sk.flowShow.models.SlickTables._
import com.neo.sk.utils.DBUtil.db
import slick.jdbc.PostgresProfile.api._

/**
  * Created by whisky on 17/4/14.
  */
object GroupDao {

  def listDistributedGroups = db.run(
    tGroups.filter(_.groupId =!= Constants.defaultGroupId).result
  )

}