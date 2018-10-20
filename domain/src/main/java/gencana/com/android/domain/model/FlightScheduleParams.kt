package gencana.com.android.domain.model

import gencana.com.android.domain.hasNullOrEmpty

/**
 * Created by Gen Cana on 20/10/2018
 */
class FlightScheduleParams: Params {

    var origin: String? = null
    var destination: String? = null
    var fromDateTime: String? = null

    override fun isValid(): Boolean
            = arrayOf(origin, destination, fromDateTime).hasNullOrEmpty()
}

