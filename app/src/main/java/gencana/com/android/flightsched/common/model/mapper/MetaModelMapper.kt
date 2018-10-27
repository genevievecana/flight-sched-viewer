package gencana.com.android.flightsched.common.model.mapper

import gencana.com.android.domain.model.Link
import gencana.com.android.domain.model.Meta
import gencana.com.android.flightsched.common.model.LinkModel
import gencana.com.android.flightsched.common.model.MetaModel

/**
 * Created by Gen Cana on 27/10/2018
 */

fun Meta.mapToPresentation(): MetaModel
        = MetaModel(link.map { it.mapToPresentation() })

fun Link.mapToPresentation()
        = LinkModel(hRef, rel)