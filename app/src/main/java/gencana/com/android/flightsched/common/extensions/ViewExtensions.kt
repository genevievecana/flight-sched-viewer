package gencana.com.android.flightsched.common.extensions

import android.view.View

/**
 * Created by Gen Cana on 28/10/2018
 */

fun View.show(show: Boolean = true) {
    visibility = if (show) View.VISIBLE else View.GONE
}