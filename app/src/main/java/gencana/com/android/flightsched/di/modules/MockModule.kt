package gencana.com.android.flightsched.di.modules

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Gen Cana on 31/10/2018
 */

@Module
class MockModule{

    @Provides
    @Named("IS_MOCK")
    fun providesMockOnly(): Boolean {
        return false
    }

}