package gencana.com.android.data.entity

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

/**
 * Created by Gen Cana on 27/10/2018
 */

@JsonSerializable
data class AirportResponseData(
        @Json(name = "AirportsResource") val airportDetails: AirportResourceData
)

data class AirportResourceData(
        @Json(name = "Airports") val airports: List<AirportDetailsData>,
        @Json(name = "Meta") val meta: MetaData
)

data class AirportDetailsData(
        @Json(name = "AirportCode") val airportCode: String,
        @Json(name = "Position") val position: PositionData,
        @Json(name = "CityCode") val cityCode: String,
        @Json(name = "CountryCode") val countryCode: String,
        @Json(name = "Names") val nameList: List<NameData>
)

data class PositionData(
        @Json(name = "Coordinate") val coordinate: CoordinateData
)

data class CoordinateData(
        @Json(name = "Latitude") val latitude: Double,
        @Json(name = "Longitude") val longitude: Double
)

data class NameData(
        @Json(name = "$") val airportName: String
)