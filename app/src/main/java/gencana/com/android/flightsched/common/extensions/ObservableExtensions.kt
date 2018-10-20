package gencana.com.android.flightsched.common.extensions

import gencana.com.android.flightsched.common.model.Result
import io.reactivex.Observable

/**
 * Created by Gen Cana on 20/10/2018
 */

fun <T> Observable<Result<T>>.addErrorHandler(): Observable<Result<T>> {
    return onErrorResumeNext{throwable: Throwable -> Observable.just(Result(error = throwable.message)) }
}