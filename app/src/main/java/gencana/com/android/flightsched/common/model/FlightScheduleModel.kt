package gencana.com.android.flightsched.common.model

/**
 * Created by Gen Cana on 20/10/2018
 */

data class FlightScheduleModel(
        val flightDuration: String,
        val flight: List<FlightModel>
)

data class FlightModel(
        val departure: AirportModel,
        val arrival: AirportModel,
        val marketingCarrier: CarrierModel,
        val operatingCarrier: CarrierModel,
        val airCraftCode: Int,
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