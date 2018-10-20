package gencana.com.android.data.repository.flightrepository

import gencana.com.android.data.BaseTestClass
import gencana.com.android.data.entity.FlightScheduleData
import gencana.com.android.data.repository.flightrepository.datastore.FlightDataStore
import gencana.com.android.data.repository.flightrepository.datastore.FlightDataStoreFactory
import gencana.com.android.domain.model.FlightSchedule
import gencana.com.android.domain.model.TotalJourney
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
class FlightDataRepositoryTest: BaseTestClass() {

    private lateinit var dataRepository: FlightDataRepository

    @Mock
    private lateinit var dataStoreFactory: FlightDataStoreFactory

    @Mock
    private lateinit var dataStore: FlightDataStore

    private val testObserver by lazy {
        TestObserver<FlightSchedule>()
    }

    private val flightSchedule by lazy {
        FlightSchedule(TotalJourney(TEST_STRING), listOf())
    }

    override fun setup() {
        dataRepository = FlightDataRepository(dataStoreFactory)
        `when`(dataStoreFactory.create()).thenReturn(dataStore)
        `when`(dataStore.getFlightSchedules(anyString(), anyString(), anyString()))
                .thenReturn(Single.just(flightSchedule))
    }

    @Test
    fun `test valid`(){
        dataRepository
                .getFlightSchedules("a", "b", "c")
                .subscribe(testObserver)

        verify(dataStoreFactory).create()
        verify(dataStore).getFlightSchedules(anyString(), anyString(), anyString())

        assertBuilder.that(testObserver.assertResult(flightSchedule))

        verifyNoMoreInteractions(dataStoreFactory)
        verifyNoMoreInteractions(dataStore)
    }

}