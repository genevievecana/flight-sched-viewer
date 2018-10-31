package gencana.com.android.data.repository.flightrepository.datastore

import com.squareup.moshi.Moshi
import gencana.com.android.data.entity.AirportResponseData
import gencana.com.android.data.entity.ScheduleResponseData
import gencana.com.android.data.source.local.getAirportList
import io.reactivex.Single

/**
 * Created by Gen Cana on 31/10/2018
 */

class FlightLocalDataStore(private val moshi: Moshi) : FlightDataStore{

    override fun getAirportDetailsList(): Single<AirportResponseData>
            = Single.just(getAirportList(moshi))

    override fun getAirportDetails(airportCode: String)
            : Single<AirportResponseData>
            = Single.just(null)

    override fun getFlightSchedules(origin: String, destination: String, fromDateTime: String)
            : Single<ScheduleResponseData>
            = Single.just(null)
}