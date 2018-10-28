package gencana.com.android.domain.model

/**
 * Created by Gen Cana on 20/10/2018
 */

data class ScheduleResponse(
        val scheduleResource: ScheduleResource
)

data class ScheduleResource(
        val schedule: List<FlightSchedule>,
        val meta: Meta
)

data class FlightSchedule(
        val totalJourney: TotalJourney,
        val flight: List<Flight>
)

data class TotalJourney(
        val duration: String
)

data class Flight(
        val departure: Airport,
        val arrival: Airport,
        val marketingCarrier: Carrier,
        val operatingCarrier: Carrier?,
        val equipment: Equipment,
        val details: Details
)

data class Airport(
        val airportCode: String,
        val scheduledTimeLocal: ScheduledTimeLocal,
        val terminal: Terminal?
)

data class ScheduledTimeLocal(
        val dateTime: String
)

data class Terminal(
        val name: String
)

data class Carrier(
        val airlineId: String,
        val flightNumber: Int?
)

data class Equipment(
        val airCraftCode: String
)

data class Details(
        val daysOfOperation: Int
)