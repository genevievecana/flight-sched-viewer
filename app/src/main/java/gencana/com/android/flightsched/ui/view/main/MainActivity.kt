package gencana.com.android.flightsched.ui.view.main

import android.os.Bundle
import android.widget.Toast
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.extensions.defaultMultiAdapter
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.common.model.ScheduleResponseModel
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import gencana.com.android.flightsched.ui.view.base.BaseActivity
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel, ScheduleResponseModel>() {

    private lateinit var recyclerMultiAdapter: RecyclerMultiAdapter<FlightScheduleModel>

    override val layout: Int
        get() = R.layout.activity_main

    override fun setupActivity(savedInstanceState: Bundle?) {
        recyclerMultiAdapter = recycler_view.defaultMultiAdapter()
        //Test
        viewModel.switchMapDefaultExecute(
                Observable.just(FlightScheduleParams("MNL", "JFK", "2018-10-23")))
    }

    override fun showLoading(show: Boolean) {
    }

    override fun onResponseSuccess(data: ScheduleResponseModel) {
        recyclerMultiAdapter.addItems(data.scheduleResource.schedule)
    }

    override fun onError(errorMsg: String?) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show()

    }

}
