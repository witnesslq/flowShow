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
  * @note JavaScript name: <code>series&lt;scatter&gt;-data-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesScatterDataMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesSelect]] = js.undefined
}

object SeriesScatterDataMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesSelect]] = js.undefined): SeriesScatterDataMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesSelect]] = select
    new SeriesScatterDataMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesScatterDataMarkerStatesSelect]] = selectOuter
    }
  }
}
