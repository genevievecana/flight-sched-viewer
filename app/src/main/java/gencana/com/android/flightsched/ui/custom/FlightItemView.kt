package gencana.com.android.flightsched.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.model.FlightModel
import gencana.com.android.flightsched.common.utils.formatDefaultToTime24
import kotlinx.android.synthetic.main.view_flight_item.view.*

/**
 * Created by Gen Cana on 26/10/2018
 */

class FlightItemView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), BaseView<FlightModel> {

    private var view: View = setupView(this)

    override fun onBind(data: FlightModel) {
        view.txt_flight_number.text = String.format("%s%s",
                data.marketingCarrier.airlineId, data.marketingCarrier.flightNumber)
        view.txt_itinerary.text = String.format("%s - %s",
                data.departure.airportCode, data.arrival.airportCode)
        view.txt_aircraft.text = String.format(context.getString(R.string.aircraft_type), data.airCraftCode)
        view.txt_flight_time.text = String.format("%s - %s",
                formatDefaultToTime24(data.departure.scheduledTimeLocal),
                formatDefaultToTime24(data.arrival.scheduledTimeLocal))
        view.txt_terminal.text = String.format(context.getString(R.string.departure_terminal),
                data.departure.terminalName)
    }

    override fun getLayout(): Int = R.layout.view_flight_item

}