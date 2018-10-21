package gencana.com.android.data.source.remote.authentication

import gencana.com.android.data.source.local.SharedPrefHelper
import gencana.com.android.data.source.remote.ApiServiceHolder
import java.io.IOException
import java.net.HttpURLConnection

/**
 * Created by Gen Cana on 21/10/2018
 */

class RefreshTokenManager constructor(
        private val apiServiceHolder: ApiServiceHolder,
        private var prefHelper: SharedPrefHelper){

    private var newToken: String? = null
    private val maxRetry = 3

    fun isTokenValid(): Boolean {
        return !newToken.isNullOrEmpty()
    }

    fun refreshToken() {
        for (i in 0..maxRetry) {
            if (generateToken())
                break
        }
    }

    private fun generateToken(): Boolean {
        try {
            apiServiceHolder.getApiService()?.refreshToken()?.let {
                it.execute()?.let { response ->
                    if (response.code() == HttpURLConnection.HTTP_OK) {
                        response.body()?.let { token -> prefHelper.saveToken(token) }
                        newToken = prefHelper.getToken()
                        return true
                    }
                }
            }
        }catch (exception: IOException){
            exception.printStackTrace()
        }
        return false
    }

    fun getNewToken(): String? {
        return newToken
    }


}