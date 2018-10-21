package gencana.com.android.data.source.remote.adapter

import com.squareup.moshi.*
import com.squareup.moshi.JsonAdapter


/**
 * Created by Gen Cana on 21/10/2018
 */

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class SingleToArray

class SingleToArrayAdapter(private val delegateAdapter: JsonAdapter<List<Any>?>,
                           private val elementAdapter: JsonAdapter<Any?>)
    : JsonAdapter<List<Any>?>() {

    override fun toJson(writer: JsonWriter, value: List<Any>?) {
        if (value?.size == 1) {
            elementAdapter.toJson(writer, value[0])
        } else {
            delegateAdapter.toJson(writer, value)
        }
    }

    @SingleToArray
    override fun fromJson(reader: JsonReader): List<Any>? {
        return if (reader.peek() != JsonReader.Token.BEGIN_ARRAY) {
            elementAdapter.fromJson(reader)?.let {
                listOf(it)
            }?: listOf()
        } else delegateAdapter.fromJson(reader)

    }


    companion object {

        val FACTORY: JsonAdapter.Factory = Factory { type, annotations, moshi ->
            val delegateAnnotations = Types.nextAnnotations(annotations, SingleToArray::class.java)
                    ?: return@Factory null
            if (Types.getRawType(type) !== List::class.java) {
                throw IllegalArgumentException(
                        "Only lists may be annotated with @SingleToArray. Found: $type")
            }
            val elementType = Types.collectionElementType(type, List::class.java)
            val delegateAdapter = moshi.adapter<List<Any>>(type, delegateAnnotations)
            val elementAdapter = moshi.adapter<Any>(elementType)
            SingleToArrayAdapter(delegateAdapter, elementAdapter)
        }
    }
}