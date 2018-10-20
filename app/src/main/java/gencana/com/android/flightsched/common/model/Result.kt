package gencana.com.android.flightsched.common.model

/**
 * Created by Gen Cana on 20/10/2018
 */

data class Result<T>(
        var data: T? = null,
        val error: String? = null
){

    fun hasError(): Boolean{
        return error != null
    }
}