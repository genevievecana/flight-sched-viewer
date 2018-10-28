package gencana.com.android.data.entity

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

/**
 * Created by Gen Cana on 27/10/2018
 */

@JsonSerializable
data class MetaData(
        @Json(name = "Link") val link: List<LinkData>
)

@JsonSerializable
data class LinkData(
        @Json(name = "@Href") val hRef: String,
        @Json(name = "@Rel") val rel: String
)