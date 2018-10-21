package gencana.com.android.flightsched.di.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import gencana.com.android.flightsched.common.constants.SHARED_PREF_NAME
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module(includes = [(ViewModelModule::class)])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app : Application) : Context = app

    @Provides
    @Singleton
    fun provideIoScheduler() : Scheduler = Schedulers.io()

    @Provides
    @Singleton
    fun provideSharedPreference(app: Application): SharedPreferences =
            app.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
}