package gencana.com.android.flightsched.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import gencana.com.android.data.di.DataModule
import gencana.com.android.flightsched.application.MyApplication
import gencana.com.android.flightsched.di.modules.ActivitiesBindingModule
import gencana.com.android.flightsched.di.modules.AppModule
import gencana.com.android.flightsched.di.modules.MockModule
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivitiesBindingModule::class,
    DataModule::class,
    MockModule::class
])

interface AppComponent: AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun create(app: Application): Builder

        fun build(): AppComponent
    }
}