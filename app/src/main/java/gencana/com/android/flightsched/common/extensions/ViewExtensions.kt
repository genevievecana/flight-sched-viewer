package gencana.com.android.flightsched.common.extensions

import android.view.View

/**
 * Created by Gen Cana on 28/10/2018
 */

fun View.show(show: Boolean = true) {
    visibility = if (show) View.VISIBLE else View.GONE
}

fun View.invisible(invisible: Boolean = true) {
    visibility = if (invisible) View.INVISIBLE else View.VISIBLE
}

fun View.isVisible(): Boolean
        = visibility == View.VISIBLE