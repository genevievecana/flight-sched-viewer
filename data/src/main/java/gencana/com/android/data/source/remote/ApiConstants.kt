package gencana.com.android.data.source.remote

/**
 * Created by Gen Cana on 20/10/2018
 */

//parameters
const val FIELD_ORIGIN = "origin"
const val FIELD_DESTINATION = "destination"
const val FIELD_DATE = "fromDateTime"


//endpoints
const val ENDPOINT_FLIGHT_SCHEDULES = "/operations/schedules/$FIELD_ORIGIN/$FIELD_DESTINATION/$FIELD_DATE"