package gencana.com.android.flightsched.ui.view.main

import gencana.com.android.domain.interactor.GetFlightSchedulesInteractor
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.common.model.Result
import gencana.com.android.flightsched.common.model.mapper.mapToPresentation
import gencana.com.android.flightsched.ui.view.base.BaseViewModel
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Gen Cana on 20/10/2018
 */
class MainViewModel @Inject constructor(
        private val flightSchedulesInteractor: GetFlightSchedulesInteractor
): BaseViewModel<FlightScheduleModel, FlightScheduleParams>() {

    override fun getObservable(params: FlightScheduleParams): Observable<Result<FlightScheduleModel>>
        = flightSchedulesInteractor.getObservable(params)
            .toObservable()
            .map{ Result(it.mapToPresentation()) }
}