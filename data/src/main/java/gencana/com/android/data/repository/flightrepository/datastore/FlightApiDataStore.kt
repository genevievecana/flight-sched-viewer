package gencana.com.android.data.repository.flightrepository.datastore

import gencana.com.android.data.entity.AirportResponseData
import gencana.com.android.data.entity.ScheduleResponseData
import gencana.com.android.data.source.remote.FlightApiService
import io.reactivex.Single

/**
 * Created by Gen Cana on 20/10/2018
 */

class FlightApiDataStore(private val flightApiService: FlightApiService) : FlightDataStore{
    override fun getAirportDetails(airportCode: String)
            : Single<AirportResponseData>
            = flightApiService.getAirportDetails(airportCode)

    override fun getFlightSchedules(origin: String, destination: String, fromDateTime: String)
            : Single<ScheduleResponseData>
            = flightApiService.getFlightSchedules(origin, destination, fromDateTime)

}