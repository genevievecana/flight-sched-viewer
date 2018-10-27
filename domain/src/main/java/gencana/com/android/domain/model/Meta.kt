package gencana.com.android.domain.model

/**
 * Created by Gen Cana on 27/10/2018
 */

data class Meta(
        val link: List<Link>
)

data class Link(
        val hRef: String,
        val rel: String
)