package gencana.com.android.data.repository.flightrepository.datastore

import gencana.com.android.data.BaseTestClass
import gencana.com.android.data.source.remote.FlightApiService
import gencana.com.android.domain.model.FlightSchedule
import io.reactivex.Single
import io.reactivex.observers.TestObserver
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Gen Cana on 20/10/2018
 */
@RunWith(MockitoJUnitRunner::class)
class FlightApiDataStoreTest: BaseTestClass(){

    @Mock
    private lateinit var flightApiService: FlightApiService

    private lateinit var apiDataStore: FlightApiDataStore

    private val testObserver by lazy {
        TestObserver<FlightSchedule>()
    }

    @Mock
    private lateinit var flightSchedule: FlightSchedule

    override fun setup() {
        apiDataStore = FlightApiDataStore(flightApiService)
        `when`(flightApiService.getFlightSchedules(anyString(), anyString(), anyString()))
                .thenReturn(Single.just(flightSchedule))
    }

    @Test
    fun `test valid`(){
        apiDataStore
                .getFlightSchedules("a", "b", "c")
                .subscribe(testObserver)

        verify(flightApiService)
                .getFlightSchedules(anyString(), anyString(), anyString())
        assertBuilder.that(testObserver.assertResult(flightSchedule))
        verifyNoMoreInteractions(flightApiService)
    }

}