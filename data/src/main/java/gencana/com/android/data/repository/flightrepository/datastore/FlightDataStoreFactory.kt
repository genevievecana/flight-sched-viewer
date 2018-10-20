package gencana.com.android.data.repository.flightrepository.datastore

import gencana.com.android.data.source.remote.FlightApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Singleton
class FlightDataStoreFactory @Inject constructor(
        private val apiService: FlightApiService){

    fun create(): FlightDataStore{
        return FlightApiDataStore(apiService)
    }


}