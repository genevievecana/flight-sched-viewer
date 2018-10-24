package gencana.com.android.flightsched.common.utils

import gencana.com.android.flightsched.R

/**
 * Created by Gen Cana on 24/10/2018
 */

fun formatStopCount(count: Int): Int{
    return if (count == 1) R.string.stop_count else R.string.stops_count
}

fun formatDuration(duration: String): String{
    return duration
            .substring(1)
            .replace("T", "")
            .replace(Regex("(?=\\d)(?<=\\D)"), " ")
}
