package gencana.com.android.domain.model


/**
 * Created by Gen Cana on 27/10/2018
 */

data class AirportResponse(
        val airportDetails: AirportResource
)

data class AirportResource(
        val airports: List<AirportItem>,
        val meta: Meta
)

data class AirportItem(
        val airports: List<AirportDetails>
)

data class AirportDetails(
        val airportCode: String,
        val position: Position,
        val cityCode: String,
        val countryCode: String,
        val nameList: Names
)

data class Position(
        val coordinate: Coordinate
)

data class Coordinate(
        val latitude: Double,
        val longitude: Double
)

data class Names(
        val airportNameList: List<Name>
)

data class Name(
        val airportName: String
)