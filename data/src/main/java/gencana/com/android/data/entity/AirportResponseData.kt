package gencana.com.android.data.entity

import com.squareup.moshi.Json
import gencana.com.android.data.source.remote.adapter.SingleToArray
import se.ansman.kotshi.JsonSerializable

/**
 * Created by Gen Cana on 27/10/2018
 */

@JsonSerializable
data class AirportResponseData(
        @Json(name = "AirportResource") val airportsResource: AirportResourceData
)

@JsonSerializable
data class AirportResourceData(
        @Json(name = "Airports") @SingleToArray val airports: List<AirportItemData>,
        @Json(name = "Meta") val meta: MetaData
)

@JsonSerializable
data class AirportItemData(
        @Json(name = "Airport") @SingleToArray val airports: List<AirportDetailsData>
)

@JsonSerializable
data class AirportDetailsData(
        @Json(name = "AirportCode") val airportCode: String,
        @Json(name = "Position") val position: PositionData,
        @Json(name = "CityCode") val cityCode: String,
        @Json(name = "CountryCode") val countryCode: String,
        @Json(name = "Names") val nameList: NamesData
)

@JsonSerializable
data class PositionData(
        @Json(name = "Coordinate") val coordinate: CoordinateData
)

@JsonSerializable
data class CoordinateData(
        @Json(name = "Latitude") val latitude: Double,
        @Json(name = "Longitude") val longitude: Double
)

@JsonSerializable
data class NamesData(
        @Json(name = "Name") @SingleToArray val airportNameList: List<NameData>
)

@JsonSerializable
data class NameData(
        @Json(name = "$") val airportName: String
)