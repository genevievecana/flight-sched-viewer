package gencana.com.android.flightsched.ui.view.main

import android.os.Bundle
import android.view.Menu
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.appbar.AppBarLayout
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.extensions.defaultMultiAdapter
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.common.model.ScheduleResponseModel
import gencana.com.android.flightsched.common.utils.AppBarListener
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import gencana.com.android.flightsched.ui.custom.SearchFlightView
import gencana.com.android.flightsched.ui.view.base.BaseActivity
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_search.*

class MainActivity : BaseActivity<MainViewModel, ScheduleResponseModel>() {

    private lateinit var recyclerMultiAdapter: RecyclerMultiAdapter<FlightScheduleModel>

    private var menuSearch: CheckBox? = null

    override val layout: Int
        get() = R.layout.activity_main

    override fun setupActivity(savedInstanceState: Bundle?) {
        setSupportActionBar(toobar)
        recyclerMultiAdapter = recycler_view.defaultMultiAdapter()
        setupListeners()
    }

    private fun setupListeners(){
        app_bar.addOnOffsetChangedListener(object : AppBarListener() {
            override fun onStateChanged(appBarLayout: AppBarLayout, state: State) {
                state.takeIf {
                    state != State.IDLE
                }?.apply {
                    menuSearch?.isChecked = this == State.EXPANDED
                }
            }
        })

        viewModel.addDisposable(recyclerMultiAdapter.getClickObservable<FlightScheduleModel>()
                ?.subscribe {
                })

        viewModel.switchMapDefaultExecute(Observable.create<FlightScheduleParams>{
            swipe_refresh.apply { setOnRefreshListener { it.onNext(getSearchParams()) } }
            it.setCancellable { swipe_refresh.setOnRefreshListener(null) }

            search_flight_view.searchListener = object : SearchFlightView.SearchListener{
                override fun onSearchClicked(from: String, to: String, date: String?) {
                    app_bar.setExpanded(false)
                    it.onNext(getSearchParams())
                }
            }
        })

    }

    private fun getSearchParams(): FlightScheduleParams{
        return search_flight_view.getSearchParameters()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        menu?.findItem(R.id.action_search)?.actionView?.apply {
            this as CheckBox
            menuSearch = this
            setOnCheckedChangeListener { _, isChecked ->
                app_bar.setExpanded(isChecked)
            }
        }
        return true
    }

    override fun showLoading(show: Boolean) {
        swipe_refresh.isRefreshing = show
    }

    override fun onResponseSuccess(data: ScheduleResponseModel) {
        recyclerMultiAdapter.addItems(data.scheduleResource.schedule)
    }

    override fun onError(errorMsg: String?) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show()

    }

}
