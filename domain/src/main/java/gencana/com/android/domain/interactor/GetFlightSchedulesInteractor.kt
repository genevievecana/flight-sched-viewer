package gencana.com.android.domain.interactor

import gencana.com.android.domain.model.FlightSchedule
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.domain.repository.FlightRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Gen Cana on 20/10/2018
 */
class GetFlightSchedulesInteractor
@Inject constructor(
        private val flightRepository: FlightRepository
): UseCase<FlightSchedule, FlightScheduleParams>(){

    override fun registerObservable(params: FlightScheduleParams): Single<FlightSchedule>
            = flightRepository.getFlightSchedules()
}