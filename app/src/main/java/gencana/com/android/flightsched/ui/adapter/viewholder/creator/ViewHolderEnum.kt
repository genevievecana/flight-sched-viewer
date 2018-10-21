package gencana.com.android.flightsched.ui.adapter.viewholder.creator

import android.view.View
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter

/**
 * Created by Gen Cana on 21/10/2018
 */

enum class ViewHolderEnum(val viewType: Int,
                          val layout: Int,
                          val viewHolder: (view: View) -> RecyclerMultiAdapter.BaseViewHolder<*>) {
    ;

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