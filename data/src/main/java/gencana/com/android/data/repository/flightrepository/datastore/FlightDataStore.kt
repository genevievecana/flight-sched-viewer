package gencana.com.android.data.repository.flightrepository.datastore

import gencana.com.android.domain.model.FlightSchedule
import io.reactivex.Single

/**
 * Created by Gen Cana on 20/10/2018
 */

interface FlightDataStore{

    fun getFlightSchedules(origin: String, destination: String, fromDateTime: String)
            : Single<FlightSchedule>
}