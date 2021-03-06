package gencana.com.android.flightsched.ui.view.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gencana.com.android.flightsched.common.extensions.addErrorHandler
import gencana.com.android.flightsched.common.model.Result
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Gen Cana on 20/10/2018
 */


abstract class BaseViewModel<T, Params>(private val io: Scheduler) : ViewModel() {

    val compositeDisposable by lazy { CompositeDisposable() }
    val responseLiveData by lazy { MutableLiveData<T>() }
    val loadingLiveData by lazy { MutableLiveData<Boolean>() }
    val errorLiveData by lazy { MutableLiveData<String>() }

    abstract fun getObservable(params: Params): Observable<Result<T>>

    fun execute(params: Params, showError: Boolean = true){
        execute(getObservable(params), showError)
    }

    fun execute(single: Observable<Result<T>>, showError: Boolean = true){
        if (showError) single.addErrorHandler()
        addDisposable(single
                .doOnSubscribe{loadingLiveData.postValue(true)}
                .doAfterTerminate{loadingLiveData.postValue(false)}
                .observeOn(io)
                .subscribe({ result ->
                    if (result.hasError()) errorLiveData.postValue(result.error)
                    else responseLiveData.postValue(result.data)
                }, { throwable ->
                    if (showError)errorLiveData.postValue(throwable.message)
                })
        )
    }

    fun addDisposable(disposable: Disposable?){
        disposable
                ?.let { compositeDisposable.add(it) }
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

}