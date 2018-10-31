package gencana.com.android.flightsched.ui.view.details

import gencana.com.android.domain.interactor.GetAirportDetailsInteractor
import gencana.com.android.flightsched.common.model.*
import gencana.com.android.flightsched.common.model.mapper.mapToPresentation
import gencana.com.android.flightsched.ui.view.base.BaseViewModel
import io.reactivex.Observable
import io.reactivex.Scheduler
import javax.inject.Inject


/**
 * Created by Gen Cana on 27/10/2018
 */
class FlightMapViewModel
@Inject constructor(
        private val airportDetailsInteractor: GetAirportDetailsInteractor,
        io: Scheduler
) : BaseViewModel<List<AirportDetailsModel>, String>(io) {

    override fun getObservable(params: String): Observable<Result<List<AirportDetailsModel>>>
            = Observable.empty()

    fun getAirportDetails(airportCodeList: LinkedHashSet<String>){
        execute(Observable.zip(airportCodeList.map { getAirportObservable(it) }) { t ->
            Result(t.map {
                it as AirportResponseModel
                it.airportResource.airportDetails.first().airports.first()
            })})
    }

    private fun getAirportObservable(params: String): Observable<AirportResponseModel>{
        return airportDetailsInteractor
                .getObservable(params)
                .toObservable()
                .map { it.mapToPresentation() }
    }
    
}