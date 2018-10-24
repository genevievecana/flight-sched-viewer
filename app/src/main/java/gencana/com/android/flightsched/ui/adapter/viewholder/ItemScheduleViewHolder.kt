package gencana.com.android.flightsched.ui.adapter.viewholder

import android.view.View
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import gencana.com.android.flightsched.ui.custom.SubscheduleItemView
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.item_schedule.view.*

/**
 * Created by Gen Cana on 21/10/2018
 */
class ItemScheduleViewHolder(view: View): RecyclerMultiAdapter.BaseViewHolder<FlightScheduleModel>(view){


    override fun onBind(data: FlightScheduleModel, itemClickPublisher: PublishSubject<FlightScheduleModel>?) {
        itemView.setOnClickListener { itemClickPublisher?.onNext(data) }

        data.flight.forEachIndexed { index, flightModel ->
            if (index == 0){
                itemView.txt_origin.text = flightModel.departure.airportCode
            }

            val subView = itemView.layout_subflights.getChildAt(index)
                    ?.let{
                        it as SubscheduleItemView
                    }?: SubscheduleItemView(itemView.context).also {
                itemView.layout_subflights.addView(it)
            }
            subView.onBind(flightModel)
        }
    }
}