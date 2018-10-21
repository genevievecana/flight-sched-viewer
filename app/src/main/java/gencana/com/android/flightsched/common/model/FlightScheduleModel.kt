package gencana.com.android.flightsched.common.model

import gencana.com.android.flightsched.ui.adapter.viewholder.creator.ViewHolderEnum
import gencana.com.android.flightsched.ui.adapter.viewholder.creator.ViewHolderInterface

/**
 * Created by Gen Cana on 20/10/2018
 */

data class ScheduleResponseModel(
        val scheduleResource: ScheduleResourceModel
)

data class ScheduleResourceModel(
        val schedule: List<FlightScheduleModel>
)

data class FlightScheduleModel(
        val flightDuration: String,
        val flight: List<FlightModel>
): ViewHolderInterface{

    override fun getViewType(): Int
            = ViewHolderEnum.ITEM.viewType

}

data class FlightModel(
        val departure: AirportModel,
        val arrival: AirportModel,
        val marketingCarrier: CarrierModel,
        val operatingCarrier: CarrierModel?,
        val airCraftCode: String,
        val daysOfOperation: Int
)

data class AirportModel(
        val airportCode: String,
        val scheduledTimeLocal: String,
        val terminalName: String?
)

data class CarrierModel(
        val airlineId: String,
        val flightNumber: Int?
)