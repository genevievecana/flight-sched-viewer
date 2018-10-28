package gencana.com.android.flightsched.common.model

import android.os.Parcelable
import gencana.com.android.flightsched.ui.adapter.viewholder.creator.ViewHolderEnum
import gencana.com.android.flightsched.ui.adapter.viewholder.creator.ViewHolderInterface
import kotlinx.android.parcel.Parcelize

/**
 * Created by Gen Cana on 20/10/2018
 */

data class ScheduleResponseModel(
        val scheduleResource: ScheduleResourceModel
)

data class ScheduleResourceModel(
        val schedule: List<FlightScheduleModel>,
        val meta: MetaModel
)

@Parcelize
data class FlightScheduleModel(
        val flightDuration: String,
        val flight: List<FlightModel>
): ViewHolderInterface, Parcelable{

    override fun getViewType(): Int
            = ViewHolderEnum.ITEM.viewType

}

@Parcelize
data class FlightModel(
        val departure: AirportModel,
        val arrival: AirportModel,
        val marketingCarrier: CarrierModel,
        val operatingCarrier: CarrierModel?,
        val airCraftCode: String,
        val daysOfOperation: Int
): Parcelable

@Parcelize
data class AirportModel(
        val airportCode: String,
        val scheduledTimeLocal: String,
        val terminalName: String?
): Parcelable

@Parcelize
data class CarrierModel(
        val airlineId: String,
        val flightNumber: Int?
): Parcelable