package gencana.com.android.flightsched.ui.adapter.viewholder.creator

import android.view.View
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import gencana.com.android.flightsched.ui.adapter.viewholder.ItemScheduleViewHolder

/**
 * Created by Gen Cana on 21/10/2018
 */

enum class ViewHolderEnum(val viewType: Int,
                          val layout: Int,
                          val viewHolder: (view: View) -> RecyclerMultiAdapter.BaseViewHolder<*>) {

    ITEM(0, R.layout.item_schedule, { view: View -> ItemScheduleViewHolder(view) });


    companion object {

        fun getViewHolderType(type: Int): ViewHolderEnum?{
            ViewHolderEnum.values().forEach {
                if (it.viewType == type){
                    return it
                }
            }

            return null
        }
    }
}