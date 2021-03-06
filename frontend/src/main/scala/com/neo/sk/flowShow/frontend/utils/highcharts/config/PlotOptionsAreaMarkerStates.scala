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
  * @note JavaScript name: <code>plotOptions-area-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreaMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesSelect]] = js.undefined
}

object PlotOptionsAreaMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesSelect]] = js.undefined): PlotOptionsAreaMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesSelect]] = select
    new PlotOptionsAreaMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsAreaMarkerStatesSelect]] = selectOuter
    }
  }
}
