package gencana.com.android.flightsched.ui.view.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import gencana.com.android.flightsched.common.extensions.addObserver
import java.lang.reflect.ParameterizedType
import javax.inject.Inject

/**
 * Created by Gen Cana on 20/10/2018
 */

abstract class BaseActivity<VM: BaseViewModel<T, *>, T>: AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected lateinit var viewModel: VM
    protected abstract val layout: Int

    protected abstract fun setupActivity(savedInstanceState: Bundle?)
    protected abstract fun showLoading(show: Boolean)
    abstract fun onResponseSuccess(data: T)
    abstract fun onError(errorMsg: String?)

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layout)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
                .get((this.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<VM>)
        observeLiveData()
        setupActivity(savedInstanceState)
    }

    private fun observeLiveData() {
        viewModel.responseLiveData.addObserver(this) { t: T -> onResponseSuccess(t)}
        viewModel.errorLiveData.addObserver(this) { t: String ->  onError(t)}
        viewModel.loadingLiveData.addObserver(this) { t: Boolean -> showLoading(t)}

    }
}