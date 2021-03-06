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
  * @note JavaScript name: <code>series&lt;spline&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSplineMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesSelect]] = js.undefined
}

object SeriesSplineMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesSelect]] = js.undefined): SeriesSplineMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesSelect]] = select
    new SeriesSplineMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesSplineMarkerStatesSelect]] = selectOuter
    }
  }
}
