package gencana.com.android.data.entity

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

/**
 * Created by Gen Cana on 20/10/2018
 */

@JsonSerializable
data class ScheduleResponseData(
        @Json(name = "ScheduleResource") val scheduleResource: ScheduleResourceData
)

@JsonSerializable
data class ScheduleResourceData(
    @Json(name = "Schedule") val schedule: List<FlightScheduleData>
)

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
        @Json(name = "OperatingCarrier") val operatingCarrier: CarrierData?,
        @Json(name = "Equipment") val equipment: EquipmentData,
        @Json(name = "Details") val details: DetailsData
)

@JsonSerializable
data class AirportData(
        @Json(name = "AirportCode") val airportCode: String,
        @Json(name = "ScheduledTimeLocal") val scheduledTimeLocal: ScheduledTimeLocalData,
        @Json(name = "Terminal") val terminal: TerminalData?
)

@JsonSerializable
data class ScheduledTimeLocalData(
        @Json(name = "DateTime")val dateTime: String
)

@JsonSerializable
data class TerminalData(
        @Json(name = "Name") val name: String
)

@JsonSerializable
data class CarrierData(
        @Json(name = "AirlineID") val airlineId: String,
        @Json(name = "FlightNumber") val flightNumber: Int?
)

@JsonSerializable
data class EquipmentData(
        @Json(name = "AircraftCode") val airCraftCode: String
)

@JsonSerializable
data class DetailsData(
        @Json(name = "DaysOfOperation") val daysOfOperation: Int
)