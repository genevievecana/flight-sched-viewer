package gencana.com.android.data.source.remote.authentication

import gencana.com.android.data.source.local.SharedPrefHelper
import gencana.com.android.data.source.remote.*
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

/**
 * Created by Gen Cana on 21/10/2018
 */

class AuthInterceptor @Inject constructor(
        private val sharedPrefHelper: SharedPrefHelper
) : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val builder = original.headers().newBuilder()
        if (builder.get(HEADER_AUTH_TYPE) != HEADER_AUTH_NONE){
            builder.set(HEADER_ACCEPT, HEADER_JSON)
            builder.set(HEADER_CONTENT_TYPE, HEADER_JSON)
            builder.set(HEADER_AUTH, sharedPrefHelper.getToken() ?: "")
        }
        return chain.proceed(original.newBuilder().headers(builder.build()).build())
    }

}