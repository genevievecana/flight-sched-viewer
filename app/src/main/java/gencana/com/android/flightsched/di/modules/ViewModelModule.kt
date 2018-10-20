package gencana.com.android.flightsched.di.modules

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import gencana.com.android.flightsched.common.viewmodel.ViewModelFactory

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}