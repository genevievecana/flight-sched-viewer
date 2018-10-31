package gencana.com.android.flightsched

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * Created by Gen Cana on 29/10/2018
 */

open class TestLiveDataObserver<T> : Observer<T> {

    val observedValues = mutableListOf<T?>()

    override fun onChanged(value: T?) {
        observedValues.add(value)
    }
}

fun <T> LiveData<T>.testObserver() = TestLiveDataObserver<T>().also {
    observeForever(it)
}