package gencana.com.android.data.entity

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

/**
 * Created by Gen Cana on 20/10/2018
 */

@JsonSerializable
data class FlightScheduleData(
        @Json(name = "TotalJourney") val totalJourney: TotalJourneyData,
        @Json(name = "Flight") val flight: List<FlightData>
)

@JsonSerializable
data class TotalJourneyData(
        @Json(name = "Duration") val duration: String
)

@JsonSerializable
data class FlightData(
        @Json(name = "Departure") val departure: AirportData,
        @Json(name = "Arrival") val arrival: AirportData,
        @Json(name = "MarketingCarrier") val marketingCarrier: CarrierData,
        @Json(name = "OperatingCarrier") val operatingCarrier: CarrierData,
        @Json(name = "Equipment") val equipment: EquipmentData,
        @Json(name = "Details") val details: DetailsData
)

@JsonSerializable
data class AirportData(
        val airportCode: String,
        val scheduledTimeLocal: ScheduledTimeLocalData,
        val terminal: TerminalData?
)

@JsonSerializable
data class ScheduledTimeLocalData(
        val dateTime: String
)

@JsonSerializable
data class TerminalData(
        val name: String
)

@JsonSerializable
data class CarrierData(
        val airlineId: String,
        val flightNumber: Int?
)

@JsonSerializable
data class EquipmentData(
        val airCraftCode: Int
)

@JsonSerializable
data class DetailsData(
        val daysOfOperation: Int
)