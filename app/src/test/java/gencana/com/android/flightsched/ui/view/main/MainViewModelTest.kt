package gencana.com.android.flightsched.ui.view.main

import gencana.com.android.domain.interactor.GetAirportListDetailsInteractor
import gencana.com.android.domain.interactor.GetFlightSchedulesInteractor
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.domain.model.ScheduleResponse
import gencana.com.android.flightsched.BaseTestClass
import gencana.com.android.flightsched.TestLiveDataObserver
import gencana.com.android.flightsched.testObserver
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*

/**
 * Created by Gen Cana on 29/10/2018
 */
class MainViewModelTest: BaseTestClass(){

    @Mock
    private lateinit var scheduleInteractor: GetFlightSchedulesInteractor

    @Mock
    private lateinit var airportListInteractor: GetAirportListDetailsInteractor

    private lateinit var mainViewModel: MainViewModel

    private lateinit var liveDataLoading: TestLiveDataObserver<Boolean>
    private lateinit var liveDataError: TestLiveDataObserver<String>


    override fun setup() {
        mainViewModel = MainViewModel(scheduleInteractor, airportListInteractor, Schedulers.trampoline())
    }

    @Test
    fun loadingStates() {
        val params = FlightScheduleParams("BCN", "MNL", "2018-10-11")
        val scheduleResponse = mock(ScheduleResponse::class.java)
        liveDataLoading = mainViewModel.loadingLiveData.testObserver()

        `when`(scheduleInteractor.getObservable(params))
                .thenReturn(Single.just(scheduleResponse))

        mainViewModel.execute(params)

        assertBuilder
                .that(liveDataLoading.observedValues.size)
                .isEqualTo(2)

        assertBuilder
                .that(liveDataLoading.observedValues)
                .isEqualTo(listOf(true, false))

        Mockito.verify(scheduleInteractor)
                .getObservable(params)

        verifyNoMoreInteractions(scheduleInteractor)
    }

    @Test
    fun `loadingStates and error`() {
        val params = mock(FlightScheduleParams::class.java)
        val sampleError = "This is a test error"

        liveDataError = mainViewModel.errorLiveData.testObserver()
        liveDataLoading = mainViewModel.loadingLiveData.testObserver()

        `when`(scheduleInteractor.getObservable(params))
                .thenReturn(Single.error(NullPointerException(sampleError)))

        mainViewModel.execute(params)

        assertBuilder
                .that(liveDataLoading.observedValues.size)
                .isEqualTo(2)

        assertBuilder
                .that(liveDataLoading.observedValues)
                .isEqualTo(listOf(true, false))

        assertBuilder.that(liveDataError.observedValues)
                .isEqualTo(listOf(sampleError))

        Mockito.verify(scheduleInteractor)
                .getObservable(params)

        verifyNoMoreInteractions(scheduleInteractor)

    }

}