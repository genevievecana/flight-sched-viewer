package gencana.com.android.data.entity.mapper

import gencana.com.android.data.entity.*
import gencana.com.android.domain.model.*

/**
 * Created by Gen Cana on 20/10/2018
 */

fun ScheduleResponseData.mapToDomain(): ScheduleResponse
        = ScheduleResponse(scheduleResource.mapToDomain())

fun ScheduleResourceData.mapToDomain(): ScheduleResource
        = ScheduleResource(schedule.map{it.mapToDomain()}, meta.mapToDomain())

fun FlightScheduleData.mapToDomain(): FlightSchedule
        = FlightSchedule(totalJourney.mapToDomain(), flight.map { it.mapToDomain() })

fun TotalJourneyData.mapToDomain(): TotalJourney
        = TotalJourney(duration)

fun FlightData.mapToDomain(): Flight
        = Flight(departure.mapToDomain(), arrival.mapToDomain(),
                marketingCarrier.mapToDomain(), operatingCarrier?.mapToDomain(),
                equipment.mapToDomain(), details.mapToDomain())

fun AirportData.mapToDomain(): Airport
        = Airport(airportCode, scheduledTimeLocal.mapToDomain(), terminal?.mapToDomain())

fun ScheduledTimeLocalData.mapToDomain(): ScheduledTimeLocal
        = ScheduledTimeLocal(dateTime)

fun TerminalData.mapToDomain(): Terminal
        = Terminal(name)

fun CarrierData.mapToDomain(): Carrier
        = Carrier(airlineId, flightNumber)

fun EquipmentData.mapToDomain(): Equipment
        = Equipment(airCraftCode)

fun DetailsData.mapToDomain(): Details
        = Details(daysOfOperation)