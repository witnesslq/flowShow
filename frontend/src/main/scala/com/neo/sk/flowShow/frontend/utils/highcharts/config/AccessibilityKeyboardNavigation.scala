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
  * @note JavaScript name: <code>accessibility-keyboardNavigation</code>
  */
@js.annotation.ScalaJSDefined
class AccessibilityKeyboardNavigation extends js.Object {

  /**
    * Enable keyboard navigation for the chart.
    * @since 5.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Skip null points when navigating through points with the keyboard.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/accessibility/advanced-accessible/">Accessible complex chart</a>
    * @since 5.0.0
    */
  val skipNullPoints: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityKeyboardNavigation {
  /**
    * @param enabled Enable keyboard navigation for the chart.
    * @param skipNullPoints Skip null points when navigating through points with the keyboard.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, skipNullPoints: js.UndefOr[Boolean] = js.undefined): AccessibilityKeyboardNavigation = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val skipNullPointsOuter: js.UndefOr[Boolean] = skipNullPoints
    new AccessibilityKeyboardNavigation {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val skipNullPoints: js.UndefOr[Boolean] = skipNullPointsOuter
    }
  }
}
