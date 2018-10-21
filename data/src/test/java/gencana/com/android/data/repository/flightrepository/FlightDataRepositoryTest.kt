package gencana.com.android.data.repository.flightrepository

import gencana.com.android.data.BaseTestClass
import gencana.com.android.data.entity.ScheduleResourceData
import gencana.com.android.data.entity.ScheduleResponseData
import gencana.com.android.data.repository.flightrepository.datastore.FlightDataStore
import gencana.com.android.data.repository.flightrepository.datastore.FlightDataStoreFactory
import io.reactivex.Single

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

    @Mock
    private lateinit var scheduleResourceData: ScheduleResourceData

    override fun setup() {
        dataRepository = FlightDataRepository(dataStoreFactory)
        `when`(dataStoreFactory.create()).thenReturn(dataStore)
        `when`(dataStore.getFlightSchedules(anyString(), anyString(), anyString()))
                .thenReturn(Single.just(ScheduleResponseData(scheduleResourceData)))
    }

    @Test
    fun `test valid`(){
        dataRepository
                .getFlightSchedules("a", "b", "c")
                .subscribe()

        verify(dataStoreFactory).create()
        verify(dataStore).getFlightSchedules(anyString(), anyString(), anyString())

        verifyNoMoreInteractions(dataStoreFactory)
        verifyNoMoreInteractions(dataStore)
    }

}