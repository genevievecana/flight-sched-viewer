package gencana.com.android.flightsched.common.model

/**
 * Created by Gen Cana on 27/10/2018
 */

data class MetaModel(
        val link: List<LinkModel>
)

data class LinkModel(
        val hRef: String,
        val rel: String
)