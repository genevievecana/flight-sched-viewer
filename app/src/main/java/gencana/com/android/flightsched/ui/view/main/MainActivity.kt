package gencana.com.android.flightsched.ui.view.main

import android.os.Bundle
import android.view.Menu
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.appbar.AppBarLayout
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.constants.KEY_FLIGHT_DATA
import gencana.com.android.flightsched.common.extensions.*
import gencana.com.android.flightsched.common.model.*
import gencana.com.android.flightsched.common.utils.AppBarListener
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import gencana.com.android.flightsched.ui.custom.SearchFlightView
import gencana.com.android.flightsched.ui.view.base.BaseActivity
import gencana.com.android.flightsched.ui.view.details.FlightMapActivity
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_search.*

class MainActivity : BaseActivity<MainViewModel, ResponseInterface<*>>() {

    private lateinit var recyclerMultiAdapter: RecyclerMultiAdapter<FlightScheduleModel>
    private var menuSearch: CheckBox? = null


    override val layout: Int
        get() = R.layout.activity_main

    override fun setupActivity(savedInstanceState: Bundle?) {
        setupViews()
        setupListeners()
        viewModel.getAirportList()
    }

    private fun setupViews(){
        setSupportActionBar(toobar)
        view_placeholder.setMainView(swipe_refresh)
        view_placeholder.showEmpty(getString(R.string.error_empty_initial))
        recyclerMultiAdapter = recycler_view.defaultMultiAdapter()
    }

    private fun setupListeners(){
        app_bar.addOnOffsetChangedListener(object : AppBarListener() {
            override fun onStateChanged(appBarLayout: AppBarLayout, state: State) {
                state.takeIf { state != State.IDLE }
                        ?.apply { menuSearch?.isChecked = this == State.EXPANDED }
            }
        })

        viewModel.addDisposable(recyclerMultiAdapter.getClickObservable<FlightScheduleModel>()
                ?.subscribe {
                    startNewActivity<FlightMapActivity>(KEY_FLIGHT_DATA, it)
                })

        viewModel.switchMapDefaultExecute(Observable.create<FlightScheduleParams>{
            swipe_refresh.apply { setOnRefreshListener { it.onNext(getSearchParams()) } }
            it.setCancellable { swipe_refresh.setOnRefreshListener(null) }
            view_placeholder.setImageActionListener { it.onNext(getSearchParams()) }

            search_flight_view.searchListener = object : SearchFlightView.SearchListener{
                override fun onSearchClicked(searchParams: FlightScheduleParams) {
                    hideKeyboard()
                    app_bar.setExpanded(false)
                    it.onNext(searchParams)
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
        if (view_placeholder.isVisible()){
            view_placeholder.showLoading(show)
        }else{
            swipe_refresh.isRefreshing = show
        }

    }

    override fun onResponseSuccess(data: ResponseInterface<*>) {
        when(data){
            is ScheduleResponseModel -> onScheduleResponse(data)
            is AirportResponseModel -> onAirportListResponse(data)
        }
    }

    private fun onScheduleResponse(data: ScheduleResponseModel){
        view_placeholder.hideError()
        recyclerMultiAdapter.addItems(data.scheduleResource.schedule)
    }

    private fun onAirportListResponse(data: AirportResponseModel){
        data.airportResource.airportDetails
                .flatMap { it.airports }
                .map { "${it.airportCode} - ${it.name.airportNameList?.firstOrNull()?.airportName ?: ""}"}
                .apply {
                    search_flight_view.addAutoCompleteList(this)
                }
    }

    override fun onError(errorMsg: String?) {
        view_placeholder.showError(null)
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show()
    }

}
