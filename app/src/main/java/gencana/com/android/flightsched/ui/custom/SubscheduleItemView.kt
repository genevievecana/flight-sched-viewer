package gencana.com.android.flightsched.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.model.FlightModel
import gencana.com.android.flightsched.common.utils.formatDefaultToReadableDate
import kotlinx.android.synthetic.main.view_flight_schedule.view.*

/**
 * Created by Gen Cana on 23/10/2018
 */

class SubscheduleItemView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), BaseView<FlightModel> {

    private var view: View = setupView(this)

    override fun onBind(data: FlightModel) {
        view.txt_destination.text = data.arrival.airportCode
        view.txt_departure_time.text = formatDefaultToReadableDate(data.departure.scheduledTimeLocal)
        view.txt_arrival_time.text = formatDefaultToReadableDate(data.arrival.scheduledTimeLocal)
    }

    override fun getLayout(): Int = R.layout.view_flight_schedule

}