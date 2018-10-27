package gencana.com.android.data.entity.mapper

import gencana.com.android.data.entity.LinkData
import gencana.com.android.data.entity.MetaData
import gencana.com.android.domain.model.Link
import gencana.com.android.domain.model.Meta

/**
 * Created by Gen Cana on 27/10/2018
 */

fun MetaData.mapToDomain(): Meta
        = Meta(link.map { it.mapToDomain() })

fun LinkData.mapToDomain()
        = Link(hRef, rel)