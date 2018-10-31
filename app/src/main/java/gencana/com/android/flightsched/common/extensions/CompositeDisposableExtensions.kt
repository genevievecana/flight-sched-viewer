package gencana.com.android.flightsched.common.extensions

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

/**
 * Created by Gen Cana on 31/10/2018
 */

fun<T> CompositeDisposable.createAndSubscribe(
        action: () -> Unit,
        observable: Observable<T>? = null,
        millisDelay: Long= 0
){
    add((observable ?: Observable.just(true))
            .delay(millisDelay, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                action.invoke()
            })
}