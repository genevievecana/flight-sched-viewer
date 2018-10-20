package gencana.com.android.domain.repository

import gencana.com.android.domain.model.FlightSchedule
import io.reactivex.Single

/**
 * Created by Gen Cana on 20/10/2018
 */

interface FlightRepository {

    fun getFlightSchedules(): Single<FlightSchedule>

}