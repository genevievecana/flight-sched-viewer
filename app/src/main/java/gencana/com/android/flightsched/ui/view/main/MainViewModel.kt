package gencana.com.android.flightsched.ui.view.main

import gencana.com.android.domain.interactor.GetAirportListDetailsInteractor
import gencana.com.android.domain.interactor.GetFlightSchedulesInteractor
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.common.model.AirportResponseModel
import gencana.com.android.flightsched.common.model.ResponseInterface
import gencana.com.android.flightsched.common.model.Result
import gencana.com.android.flightsched.common.model.mapper.mapToPresentation
import gencana.com.android.flightsched.ui.view.base.BaseViewModel
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Gen Cana on 20/10/2018
 */
class MainViewModel @Inject constructor(
        private val flightSchedulesInteractor: GetFlightSchedulesInteractor,
        private val airportListDetailsInteractor: GetAirportListDetailsInteractor
): BaseViewModel<ResponseInterface<*>, FlightScheduleParams>() {

    override fun getObservable(params: FlightScheduleParams): Observable<Result<ResponseInterface<*>>>
        = flightSchedulesInteractor.getObservable(params)
            .toObservable()
            .map{ Result(it.mapToPresentation()) } as Observable<Result<ResponseInterface<*>>>

    fun getAirportList() {
         execute(airportListDetailsInteractor.getObservable(null)
                .toObservable()
                .map { Result(it.mapToPresentation()) } as Observable<Result<ResponseInterface<*>>>
                 , false)
    }

}