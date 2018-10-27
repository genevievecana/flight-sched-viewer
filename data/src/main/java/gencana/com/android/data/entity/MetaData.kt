package gencana.com.android.data.entity

import com.squareup.moshi.Json

/**
 * Created by Gen Cana on 27/10/2018
 */

data class MetaData(
        @Json(name = "Link") val link: List<LinkData>
)

data class LinkData(
        @Json(name = "@Href") val hRef: String,
        @Json(name = "@Rel") val rel: String
)