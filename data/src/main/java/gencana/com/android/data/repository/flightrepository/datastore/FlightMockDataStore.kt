package gencana.com.android.data.repository.flightrepository.datastore

import com.squareup.moshi.Moshi
import io.reactivex.Single
import gencana.com.android.data.entity.*
import gencana.com.android.data.source.local.mock.getMockedAirportResponse
import gencana.com.android.data.source.local.mock.getMockedScheduleResponse


/**
 * Created by Gen Cana on 31/10/2018
 */

class FlightMockDataStore(private val moshi: Moshi) : FlightDataStore{

    override fun getAirportDetailsList(): Single<AirportResponseData>
        = Single.just(getMockedAirportResponse())

    override fun getAirportDetails(airportCode: String)
            : Single<AirportResponseData>
            = Single.just(getMockedAirportResponse())

    override fun getFlightSchedules(origin: String, destination: String, fromDateTime: String)
            : Single<ScheduleResponseData>
            = Single.just(getMockedScheduleResponse(moshi))

}