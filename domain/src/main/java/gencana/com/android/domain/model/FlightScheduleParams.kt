package gencana.com.android.domain.model

import gencana.com.android.domain.hasNullOrEmpty

/**
 * Created by Gen Cana on 20/10/2018
 */
data class FlightScheduleParams(
        var origin: String?,
        var destination: String?,
        var fromDateTime: String?
) : Params {

    override fun isValid(): Boolean
            = !arrayOf(origin, destination, fromDateTime).hasNullOrEmpty()
}

