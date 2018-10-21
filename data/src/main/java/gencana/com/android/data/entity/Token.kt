package gencana.com.android.data.entity

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

/**
 * Created by Gen Cana on 21/10/2018
 */

@JsonSerializable
data class Token(
        @Json(name = "access_token") val accessToken: String,
        @Json(name = "token_type") val tokenType: String,
        @Json(name = "expires_in") val expiration: Long
)