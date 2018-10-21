package gencana.com.android.flightsched.common.model.mapper

import gencana.com.android.domain.model.Airport
import gencana.com.android.domain.model.Carrier
import gencana.com.android.domain.model.Flight
import gencana.com.android.domain.model.FlightSchedule
import gencana.com.android.flightsched.common.model.AirportModel
import gencana.com.android.flightsched.common.model.CarrierModel
import gencana.com.android.flightsched.common.model.FlightModel
import gencana.com.android.flightsched.common.model.FlightScheduleModel

/**
 * Created by Gen Cana on 20/10/2018
 */

fun FlightSchedule.mapToPresentation(): FlightScheduleModel
        = FlightScheduleModel(totalJourney.duration, flight.map { it.mapToPresentation() })

fun Flight.mapToPresentation(): FlightModel
        = FlightModel(departure.mapToPresentation(), arrival.mapToPresentation(),
                marketingCarrier.mapToPresentation(), operatingCarrier.mapToPresentation(),
                equipment.airCraftCode, details.daysOfOperation)

fun Airport.mapToPresentation(): AirportModel
        = AirportModel(airportCode, scheduledTimeLocal.dateTime, terminal?.name)

fun Carrier.mapToPresentation(): CarrierModel
        = CarrierModel(airlineId, flightNumber)