package gencana.com.android.flightsched.ui.adapter.viewholder

import android.view.View
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.common.utils.formatDefaultToReadableDate
import gencana.com.android.flightsched.common.utils.formatDefaultToTime
import gencana.com.android.flightsched.common.utils.formatDuration
import gencana.com.android.flightsched.common.utils.formatStopCount
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.item_flight_sched.view.*

/**
 * Created by Gen Cana on 21/10/2018
 */
class FlightScheduleViewHolder(view: View): RecyclerMultiAdapter.BaseViewHolder<FlightScheduleModel>(view){

    override fun onBind(data: FlightScheduleModel, itemClickPublisher: PublishSubject<FlightScheduleModel>?) {
        itemView.apply {
            data.flight.first().departure.apply {
                txt_origin_code.text = airportCode
                txt_origin_time.text = formatDefaultToTime(scheduledTimeLocal)
                txt_origin_date.text = formatDefaultToReadableDate(scheduledTimeLocal)
            }

            data.flight.last().arrival.apply {
                txt_arrival_code.text = airportCode
                txt_arrival_time.text = formatDefaultToTime(scheduledTimeLocal)
                txt_arrival_date.text = formatDefaultToReadableDate(scheduledTimeLocal)
            }

            txt_duration.text = formatDuration(data.flightDuration)
            txt_stop_count.text = data.flight.lastIndex.let {
                String.format(context.getString(formatStopCount(it)), it)
            }

            setOnClickListener { itemClickPublisher?.onNext(data) }
        }
    }
}