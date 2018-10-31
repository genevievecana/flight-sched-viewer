package gencana.com.android.flightsched.ui.view.details

import android.content.Intent
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.runner.RunWith
import androidx.test.uiautomator.UiObjectNotFoundException
import androidx.test.uiautomator.UiSelector

import androidx.test.uiautomator.UiDevice

import androidx.test.platform.app.InstrumentationRegistry
import gencana.com.android.flightsched.common.constants.KEY_FLIGHT_DATA
import gencana.com.android.flightsched.common.model.AirportModel
import gencana.com.android.flightsched.common.model.CarrierModel
import gencana.com.android.flightsched.common.model.FlightModel
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import org.junit.Test


/**
 * Created by Gen Cana on 31/10/2018
 */

@RunWith(AndroidJUnit4::class)
class FlightMapActivityTest{

    private val flightScheduleModel = FlightScheduleModel("",
            listOf(FlightModel(
                    AirportModel("MNL", "", "Term"),
                    AirportModel("BCN", "", "Term"),
                    CarrierModel("", 100),
                    null, "", 1),
                    FlightModel(
                            AirportModel("ABC", "", "Term"),
                            AirportModel("DEF", "", "Term"),
                            CarrierModel("", 100),
                            null, "", 1)))

    @Rule
    @JvmField
    val activity = object: ActivityTestRule<FlightMapActivity>(FlightMapActivity::class.java){
        override fun getActivityIntent(): Intent {
            val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
            val result = Intent(targetContext, FlightMapActivity::class.java)
            result.putExtra(KEY_FLIGHT_DATA, flightScheduleModel)
            return result
        }
    }

    @Test
    fun mapActivityTest() {
        val mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

        val marker = mDevice.findObject(UiSelector().descriptionContains("Asmara"))
        try {
            marker.click()
            marker.clickTopLeft()
            val rects = marker.bounds
            mDevice.click(rects.centerX(), rects.top - 30)
        } catch (e: UiObjectNotFoundException) {
            e.printStackTrace()
        }
    }

}