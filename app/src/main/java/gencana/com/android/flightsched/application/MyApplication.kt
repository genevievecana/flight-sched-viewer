package gencana.com.android.flightsched.application

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import gencana.com.android.flightsched.di.components.DaggerAppComponent

/**
 * Created by Gen Cana on 20/10/2018
 */

class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
                .builder()
                .create(this)
                .build()
    }
}