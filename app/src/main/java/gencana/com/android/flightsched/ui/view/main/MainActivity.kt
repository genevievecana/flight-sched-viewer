package gencana.com.android.flightsched.ui.view.main

import android.os.Bundle
import android.widget.Toast
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.model.ScheduleResponseModel
import gencana.com.android.flightsched.ui.view.base.BaseActivity
import io.reactivex.Observable

class MainActivity : BaseActivity<MainViewModel, ScheduleResponseModel>() {

    override val layout: Int
        get() = R.layout.activity_main

    override fun setupActivity(savedInstanceState: Bundle?) {
        //Test
        viewModel.switchMapDefaultExecute(
                Observable.just(FlightScheduleParams("MNL", "JFK", "2018-10-23")))
    }

    override fun showLoading(show: Boolean) {
    }

    override fun onResponseSuccess(data: ScheduleResponseModel) {
        Toast.makeText(this, data.scheduleResource.schedule.get(0).flight.size.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun onError(errorMsg: String?) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show()

    }

}
