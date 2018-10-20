package gencana.com.android.data.source.remote

import gencana.com.android.domain.model.FlightSchedule
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Gen Cana on 20/10/2018
 */
interface FlightApiService {

    @GET(ENDPOINT_FLIGHT_SCHEDULES)
    fun getFlightSchedules(
            @Path(FIELD_ORIGIN) origin: String,
            @Path(FIELD_DESTINATION) destination: String,
            @Path(FIELD_DATE) fromDateTime: String
    ): Single<FlightSchedule>
}