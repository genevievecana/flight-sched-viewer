package gencana.com.android.flightsched.common.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * Created by Gen Cana on 20/10/2018
 */

fun <T> LiveData<T>.addObserver(owner: LifecycleOwner, t: (T)-> Unit){
    observe(owner, Observer {
        it?.let { it1 -> t.invoke(it1) }
    })
}