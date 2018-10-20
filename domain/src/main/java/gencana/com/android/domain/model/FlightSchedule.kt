package gencana.com.android.domain.model

/**
 * Created by Gen Cana on 20/10/2018
 */
data class FlightSchedule(
        val totalJourney: TotalJourney,
        val flight: Flight
)

data class TotalJourney(
        val duration: String
)

data class Flight(
        val departure: Airport,
        val arrival: Airport,
        val marketingCarrier: MarketingCarrier,
        val equipment: Equipment,
        val daysOfOperation: Int
)

data class Airport(
        val code: String,
        val airPortCode: ScheduledTimeLocal,
        val terminal: Terminal
)

data class ScheduledTimeLocal(
        val dateTime: String
)

data class Terminal(
        val name: String
)

data class MarketingCarrier(
        val airlineId: String,
        val flightNumber: Int
)

data class Equipment(
        val airCraftCode: Int
)