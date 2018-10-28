package gencana.com.android.flightsched.common.model.mapper

import gencana.com.android.domain.model.*
import gencana.com.android.flightsched.common.model.*

/**
 * Created by Gen Cana on 27/10/2018
 */

fun AirportResponse.mapToPresentation(): AirportResponseModel
        = AirportResponseModel(airportDetails.mapToPresentation())

fun AirportResource.mapToPresentation(): AirportResourceModel
        = AirportResourceModel(airports.map { it.mapToPresentation() }, meta.mapToPresentation())

fun AirportItem.mapToPresentation(): AirportItemModel
        = AirportItemModel(airports.map { it.mapToPresentation() })

fun AirportDetails.mapToPresentation(): AirportDetailsModel
        = AirportDetailsModel(airportCode, position.mapToPresentation(),
        cityCode, countryCode, nameList.mapToPresentation())

fun Position.mapToPresentation(): CoordinateModel
        = CoordinateModel(coordinate.latitude, coordinate.longitude)

fun Names.mapToPresentation(): NamesModel
        = NamesModel(airportNameList.map { it.mapToPresentation() })

fun Name.mapToPresentation(): NameModel
        = NameModel(airportName)