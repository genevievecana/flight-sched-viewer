package gencana.com.android.data.repository.flightrepository

import gencana.com.android.data.entity.mapper.mapToDomain
import gencana.com.android.data.repository.flightrepository.datastore.FlightDataStoreFactory
import gencana.com.android.domain.model.AirportResponse
import gencana.com.android.domain.model.ScheduleResponse
import gencana.com.android.domain.repository.FlightRepository
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Singleton
class FlightDataRepository @Inject constructor(
        private val dataStoreFactory: FlightDataStoreFactory
): FlightRepository {

    private val dataStore by lazy {
        dataStoreFactory.create()
    }

    override fun getAirportDetails(airportCode: String): Single<AirportResponse>
        = dataStore
            .getAirportDetails(airportCode)
            .map { it.mapToDomain() }


    override fun getFlightSchedules(
            origin: String, destination: String,
            fromDateTime: String
    ): Single<ScheduleResponse>
        = dataStore
            .getFlightSchedules(origin, destination, fromDateTime)
            .map { it.mapToDomain() }

}