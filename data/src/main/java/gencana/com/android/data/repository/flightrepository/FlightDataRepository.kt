package gencana.com.android.data.repository.flightrepository

import gencana.com.android.data.repository.flightrepository.datastore.FlightDataStoreFactory
import gencana.com.android.domain.model.FlightSchedule
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

    override fun getFlightSchedules(origin: String, destination: String, fromDateTime: String): Single<FlightSchedule>
        = dataStoreFactory
                .create()
                .getFlightSchedules(origin, destination, fromDateTime)

}