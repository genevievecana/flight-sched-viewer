package gencana.com.android.flightsched.common.model.mapper

import gencana.com.android.domain.model.*
import gencana.com.android.flightsched.common.model.*

/**
 * Created by Gen Cana on 20/10/2018
 */

fun ScheduleResponse.mapToPresentation(): ScheduleResponseModel
        = ScheduleResponseModel(scheduleResource.mapToPresentation())

fun ScheduleResource.mapToPresentation(): ScheduleResourceModel
        = ScheduleResourceModel(schedule.map{it.mapToPresentation()}, meta.mapToPresentation())

fun FlightSchedule.mapToPresentation(): FlightScheduleModel
        = FlightScheduleModel(totalJourney.duration, flight.map { it.mapToPresentation() })

fun Flight.mapToPresentation(): FlightModel
        = FlightModel(departure.mapToPresentation(), arrival.mapToPresentation(),
                marketingCarrier.mapToPresentation(), operatingCarrier?.mapToPresentation(),
                equipment.airCraftCode, details.daysOfOperation)

fun Airport.mapToPresentation(): AirportModel
        = AirportModel(airportCode, scheduledTimeLocal.dateTime, terminal?.name)

fun Carrier.mapToPresentation(): CarrierModel
        = CarrierModel(airlineId, flightNumber)