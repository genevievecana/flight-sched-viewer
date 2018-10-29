package gencana.com.android.domain.interactor

import gencana.com.android.domain.hasNullOrEmpty
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.domain.model.ScheduleResponse
import gencana.com.android.domain.repository.FlightRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Gen Cana on 20/10/2018
 */
class GetFlightSchedulesInteractor
@Inject constructor(
        private val flightRepository: FlightRepository
): UseCase<ScheduleResponse, FlightScheduleParams>(){

    override fun validateParams(params: FlightScheduleParams): Boolean
            = !arrayOf(params.origin, params.destination, params.fromDateTime).hasNullOrEmpty()
                && params.origin?.length == 3 && params.destination?.length == 3

    override fun registerObservable(params: FlightScheduleParams): Single<ScheduleResponse>
            = flightRepository.getFlightSchedules(params.origin!!, params.destination!!, params.fromDateTime!!)
}