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

    fun setupView(viewGroup: ViewGroup): View {
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(getLayout(), viewGroup, true)
        postSetup(view)
        return view
    }

    fun postSetup(view: View){

    }

    fun onBind(data: T){

    }

}