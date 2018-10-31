package gencana.com.android.data.repository.flightrepository.datastore

import com.squareup.moshi.Moshi
import gencana.com.android.data.source.remote.FlightApiService
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Singleton
class FlightDataStoreFactory @Inject constructor(
        private val moshi: Moshi,
        private val apiService: FlightApiService,
        @Named("IS_MOCK") private val isMock: Boolean){

    fun create(isLocal: Boolean): FlightDataStore{
        return if (isMock){
            FlightMockDataStore(moshi)
        }else{
            if (isLocal) FlightLocalDataStore(moshi)
            else FlightApiDataStore(apiService)
        }
    }


}