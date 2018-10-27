package gencana.com.android.data.entity.mapper

import gencana.com.android.data.entity.*
import gencana.com.android.domain.model.*

/**
 * Created by Gen Cana on 27/10/2018
 */

fun AirportResponseData.mapToDomain(): AirportResponse
        = AirportResponse(airportDetails.mapToDomain())

fun AirportResourceData.mapToDomain(): AirportResource
        = AirportResource(airports.map { it.mapToDomain() }, meta.mapToDomain())

fun AirportDetailsData.mapToDomain(): AirportDetails
        = AirportDetails(airportCode, position.mapToDomain(),
                cityCode, countryCode, nameList.map { it.mapToDomain() })

fun PositionData.mapToDomain(): Position
        = Position(coordinate.mapToDomain())

fun CoordinateData.mapToDomain(): Coordinate
        = Coordinate(latitude, longitude)

fun NameData.mapToDomain(): Name
        = Name(airportName)