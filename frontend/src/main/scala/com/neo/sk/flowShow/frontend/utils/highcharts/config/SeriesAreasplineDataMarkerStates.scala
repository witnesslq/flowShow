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
  * @note JavaScript name: <code>series&lt;areaspline&gt;-data-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplineDataMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesSelect]] = js.undefined
}

object SeriesAreasplineDataMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesSelect]] = js.undefined): SeriesAreasplineDataMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesSelect]] = select
    new SeriesAreasplineDataMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesAreasplineDataMarkerStatesSelect]] = selectOuter
    }
  }
}
