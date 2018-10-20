package gencana.com.android.domain.interactor

import gencana.com.android.domain.model.Params
import io.reactivex.Single
import java.security.InvalidParameterException

/**
 * Created by Gen Cana on 20/10/2018
 */

abstract class  UseCase<T, P: Params?>{

    protected abstract fun registerObservable(params: P): Single<T>

    fun getObservable(params: P): Single<T> {
        return if (!validateParams(params))
            Single.error(InvalidParameterException("Invalid Parameter"))
        else
            registerObservable(params)
    }

    open fun validateParams(params: P): Boolean{
        return params == null || params.isValid()
    }

}