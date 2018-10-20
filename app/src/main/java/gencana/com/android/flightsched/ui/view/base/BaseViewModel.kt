package gencana.com.android.flightsched.ui.view.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gencana.com.android.flightsched.common.extensions.addErrorHandler
import gencana.com.android.flightsched.common.model.Result
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Gen Cana on 20/10/2018
 */


abstract class BaseViewModel<T, Params> : ViewModel() {

    private val compositeDisposable by lazy { CompositeDisposable() }
    val responseLiveData by lazy { MutableLiveData<T>() }
    val loadingLiveData by lazy { MutableLiveData<Boolean>() }
    val errorLiveData by lazy { MutableLiveData<String>() }

    protected abstract fun getObservable(params: Params): Observable<Result<T>>

    fun switchMapDefaultExecute(source: Observable<Params>){
        execute(source.flatMap { it -> getObservable(it).addErrorHandler() })
    }

    fun execute(single: Observable<Result<T>>){
        addDisposable(single
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { loadingLiveData.postValue(true) }
                .subscribe({ result ->
                    loadingLiveData.postValue(false)
                    if (result.hasError()) errorLiveData.postValue(result.error)
                    else responseLiveData.postValue(result.data)
                }, { throwable ->
                    loadingLiveData.postValue(false)
                    errorLiveData.postValue(throwable.message)
                })
        )
    }

    fun addDisposable(disposable: Disposable?){
        disposable?.let { compositeDisposable.add(it) }
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

}