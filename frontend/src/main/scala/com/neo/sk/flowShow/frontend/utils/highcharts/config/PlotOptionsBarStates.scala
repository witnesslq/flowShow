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
  * @note JavaScript name: <code>plotOptions-bar-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBarStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsBarStatesHover]] = js.undefined
}

object PlotOptionsBarStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsBarStatesHover]] = js.undefined): PlotOptionsBarStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsBarStatesHover]] = hover
    new PlotOptionsBarStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsBarStatesHover]] = hoverOuter
    }
  }
}
