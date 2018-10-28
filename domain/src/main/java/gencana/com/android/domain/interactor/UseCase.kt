package gencana.com.android.domain.interactor

import io.reactivex.Single
import java.security.InvalidParameterException

/**
 * Created by Gen Cana on 20/10/2018
 */

abstract class  UseCase<T, P>{

    protected abstract fun registerObservable(params: P): Single<T>

    fun getObservable(params: P): Single<T> {
        return if (!validateParams(params))
            Single.error(InvalidParameterException("Invalid Parameter"))
        else
            registerObservable(params)
    }

    abstract fun validateParams(params: P): Boolean

}