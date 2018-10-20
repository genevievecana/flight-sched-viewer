package gencana.com.android.data.di

import dagger.Module
import dagger.Provides
import gencana.com.android.data.repository.flightrepository.FlightDataRepository
import gencana.com.android.domain.repository.FlightRepository
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module
class RepositoryModule {

    @Provides
    @Singleton
    internal fun providesMovieRepository(dataRepository: FlightDataRepository): FlightRepository
            = dataRepository

}