package gencana.com.android.data.source.remote

/**
 * Created by Gen Cana on 20/10/2018
 */

//parameters
const val FIELD_LIMIT = "limit"
const val FIELD_ORIGIN = "origin"
const val FIELD_DESTINATION = "destination"
const val FIELD_DATE = "fromDateTime"
const val FIELD_AIRPORT_CODE = "airport_code"
const val FIELD_CLIENT_ID = "client_id"
const val FIELD_CLIENT_SECRET = "client_secret"
const val FIELD_GRANT_TYPE = "grant_type"
const val HEADER_ACCEPT = "Accept"
const val HEADER_CONTENT_TYPE = "Content-Type"
const val HEADER_AUTH_TYPE = "Auth-Type"


//endpoints
const val ENDPOINT_REFRESH_TOKEN = "oauth/token"
const val ENDPOINT_FLIGHT_SCHEDULES = "operations/schedules/{$FIELD_ORIGIN}/{$FIELD_DESTINATION}/{$FIELD_DATE}"
const val ENDPOINT_AIRPORT_DETAILS = "references/airports/{$FIELD_AIRPORT_CODE}?lang=en"

//authentication
const val AUTH_TOKEN = "auth_token"
const val TOKEN_PREFIX = "Bearer"
const val GRANT_TYPE = "client_credentials"
const val HEADER_AUTH = "Authorization"
const val HEADER_JSON = "application/json"
const val HEADER_AUTH_NONE = "NONE"