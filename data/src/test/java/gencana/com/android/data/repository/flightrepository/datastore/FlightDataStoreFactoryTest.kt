package gencana.com.android.data.repository.flightrepository.datastore

import gencana.com.android.data.BaseTestClass
import gencana.com.android.data.source.remote.FlightApiService
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Gen Cana on 20/10/2018
 */

@RunWith(MockitoJUnitRunner::class)
class FlightDataStoreFactoryTest: BaseTestClass(){

    private lateinit var dataStoreFactory: FlightDataStoreFactory

    @Mock
    private lateinit var flightApiService: FlightApiService

    override fun setup() {
        dataStoreFactory = FlightDataStoreFactory(flightApiService)
    }

    @Test
    fun `test valid`(){
        val mockedDataStore = dataStoreFactory.create()
        assertBuilder.that(mockedDataStore).isNotNull()
        assertBuilder.that(mockedDataStore).isInstanceOf(FlightApiDataStore::class.java)
    }

}