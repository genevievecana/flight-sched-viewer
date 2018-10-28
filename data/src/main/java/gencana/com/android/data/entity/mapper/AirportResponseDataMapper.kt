package gencana.com.android.data.entity.mapper

import gencana.com.android.data.entity.*
import gencana.com.android.domain.model.*

/**
 * Created by Gen Cana on 27/10/2018
 */

fun AirportResponseData.mapToDomain(): AirportResponse
        = AirportResponse(airportsResource.mapToDomain())

fun AirportResourceData.mapToDomain(): AirportResource
        = AirportResource(airports.map { it.mapToDomain() }, meta.mapToDomain())

fun AirportItemData.mapToDomain(): AirportItem
        = AirportItem(airports.map { it.mapToDomain() })

fun AirportDetailsData.mapToDomain(): AirportDetails
        = AirportDetails(airportCode, position.mapToDomain(),
                cityCode, countryCode, nameList.mapToDomain())

fun PositionData.mapToDomain(): Position
        = Position(coordinate.mapToDomain())

fun CoordinateData.mapToDomain(): Coordinate
        = Coordinate(latitude, longitude)

fun NamesData.mapToDomain(): Names
        = Names(airportNameList.map { it.mapToDomain() })

fun NameData.mapToDomain(): Name
        = Name(airportName)