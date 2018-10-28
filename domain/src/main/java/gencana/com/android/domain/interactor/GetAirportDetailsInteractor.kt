package gencana.com.android.domain.interactor

import gencana.com.android.domain.model.AirportResponse
import gencana.com.android.domain.repository.FlightRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Gen Cana on 27/10/2018
 */
class GetAirportDetailsInteractor
@Inject constructor(
        private val flightRepository: FlightRepository
): UseCase<AirportResponse, String>(){

    override fun validateParams(params: String): Boolean
        = !params.trim().isEmpty()

    override fun registerObservable(params: String): Single<AirportResponse>
            = flightRepository.getAirportDetails(params)
}