package gencana.com.android.flightsched.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import gencana.com.android.flightsched.common.viewmodel.ViewModelFactory
import gencana.com.android.flightsched.common.viewmodel.ViewModelKey
import gencana.com.android.flightsched.ui.view.main.MainViewModel

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}