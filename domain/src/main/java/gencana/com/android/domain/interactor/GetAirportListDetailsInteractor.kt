package gencana.com.android.domain.interactor

import gencana.com.android.domain.model.AirportResponse
import gencana.com.android.domain.repository.FlightRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Gen Cana on 29/10/2018
 */
class GetAirportListDetailsInteractor
@Inject constructor(
        private val flightRepository: FlightRepository
): UseCase<AirportResponse, Any>(){

    override fun validateParams(params: Any): Boolean
        = true

    override fun registerObservable(params: Any): Single<AirportResponse>
            = flightRepository.getAirportDetailsList()
}