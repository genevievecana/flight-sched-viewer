package gencana.com.android.flightsched.common.extensions

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import gencana.com.android.flightsched.ui.adapter.RecyclerMultiAdapter
import gencana.com.android.flightsched.ui.adapter.viewholder.creator.ViewHolderInterface
import io.reactivex.subjects.PublishSubject

/**
 * Created by Gen Cana on 21/10/2018
 */


fun <E: ViewHolderInterface> RecyclerView.defaultMultiAdapter(
        itemList: ArrayList<E> = ArrayList(),
        layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
): RecyclerMultiAdapter<E> {
    setLayoutManager(layoutManager)
    val multiAdapter = RecyclerMultiAdapter(itemList, PublishSubject.create())
    adapter = multiAdapter
    return multiAdapter
}