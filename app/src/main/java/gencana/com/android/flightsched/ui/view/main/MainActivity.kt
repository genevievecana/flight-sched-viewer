package gencana.com.android.flightsched.ui.view.main

import android.os.Bundle
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.ui.view.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel, FlightScheduleModel>() {

    override val layout: Int
        get() = R.layout.activity_main

    override fun setupActivity(savedInstanceState: Bundle?) {

    }

    override fun showLoading(show: Boolean) {
    }

    override fun onResponseSuccess(data: FlightScheduleModel) {
    }

    override fun onError(errorMsg: String?) {

    }

}
