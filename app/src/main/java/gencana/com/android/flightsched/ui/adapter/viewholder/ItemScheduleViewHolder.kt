package gencana.com.android.flightsched.ui.adapter.viewholder

import android.view.View
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.item_schedule.view.*

/**
 * Created by Gen Cana on 21/10/2018
 */
class ItemScheduleViewHolder(view: View): RecyclerMultiAdapter.BaseViewHolder<FlightScheduleModel>(view){

    override fun onBind(data: FlightScheduleModel, itemClickPublisher: PublishSubject<FlightScheduleModel>?) {
        itemView.setOnClickListener { itemClickPublisher?.onNext(data) }

        val flight = data.flight.get(0)
        itemView.txt_origin.text = flight.departure.airportCode
        itemView.txt_departure_time.text = flight.departure.scheduledTimeLocal
        itemView.txt_departure_date.text = flight.departure.scheduledTimeLocal

        itemView.txt_destination.text = flight.arrival.airportCode
        itemView.txt_arrival_time.text = flight.arrival.scheduledTimeLocal
        itemView.txt_arrival_date.text = flight.arrival.scheduledTimeLocal
    }
}