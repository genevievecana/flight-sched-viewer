package gencana.com.android.flightsched.ui.view.details

import gencana.com.android.domain.interactor.GetAirportDetailsInteractor
import gencana.com.android.domain.model.AirportResponse
import gencana.com.android.flightsched.BaseTestClass
import gencana.com.android.flightsched.TestLiveDataObserver
import gencana.com.android.flightsched.testObserver
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import java.lang.NullPointerException

/**
 * Created by Gen Cana on 30/10/2018
 */
class FlightMapViewModelTest: BaseTestClass(){

    @Mock
    private lateinit var airportListInteractor: GetAirportDetailsInteractor

    private lateinit var flightMapViewModel: FlightMapViewModel

    private lateinit var liveDataLoading: TestLiveDataObserver<Boolean>

    private lateinit var liveDataError: TestLiveDataObserver<String>

    override fun setup() {
        flightMapViewModel = FlightMapViewModel(airportListInteractor, Schedulers.trampoline())
    }

    @Test
    fun `getAirportDetailsList loading`() {
        val params = "BCN"
        val airportResponse = Mockito.mock(AirportResponse::class.java)

        liveDataLoading = flightMapViewModel.loadingLiveData.testObserver()

        Mockito.`when`(airportListInteractor.getObservable(params))
                .thenReturn(Single.just(airportResponse))

        flightMapViewModel.getAirportDetails(linkedSetOf(params, params, params))

        assertBuilder
                .that(liveDataLoading.observedValues.size)
                .isEqualTo(2)

        assertBuilder
                .that(liveDataLoading.observedValues)
                .isEqualTo(listOf(true, false))

        Mockito.verify(airportListInteractor)
                .getObservable(params)

        Mockito.verifyNoMoreInteractions(airportListInteractor)

    }

    @Test
    fun `getAirportDetailsList loading and error`() {
        val params = "BCN"
        val sampleError = "This is a sample error"

        liveDataLoading = flightMapViewModel.loadingLiveData.testObserver()
        liveDataError = flightMapViewModel.errorLiveData.testObserver()

        Mockito.`when`(airportListInteractor.getObservable(params))
                .thenReturn(Single.error(NullPointerException(sampleError)))

        flightMapViewModel.getAirportDetails(linkedSetOf(params, params, params))

        assertBuilder
                .that(liveDataLoading.observedValues.size)
                .isEqualTo(2)

        assertBuilder
                .that(liveDataLoading.observedValues)
                .isEqualTo(listOf(true, false))

        assertBuilder
                .that(liveDataError.observedValues)
                .isEqualTo(listOf(sampleError))


        Mockito.verify(airportListInteractor)
                .getObservable(params)

        Mockito.verifyNoMoreInteractions(airportListInteractor)

    }
}