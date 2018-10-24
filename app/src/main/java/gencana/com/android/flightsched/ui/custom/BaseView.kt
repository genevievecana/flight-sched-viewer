package gencana.com.android.flightsched.ui.custom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

/**
 * Created by Gen Cana on 23/10/2018
 */

interface BaseView<T> {

    @LayoutRes
    fun getLayout(): Int

    fun setupView(viewGroup: ViewGroup): View
        = LayoutInflater.from(viewGroup.context)
            .inflate(getLayout(), viewGroup, true)

    fun onBind(data: T)

}