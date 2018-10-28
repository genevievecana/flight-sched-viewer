package gencana.com.android.flightsched.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import gencana.com.android.flightsched.ui.view.details.FlightMapActivity
import gencana.com.android.flightsched.ui.view.main.MainActivity

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module
interface ActivitiesBindingModule {

    @ContributesAndroidInjector(modules = [])
    fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [])
    fun flightMapActivity(): FlightMapActivity
}