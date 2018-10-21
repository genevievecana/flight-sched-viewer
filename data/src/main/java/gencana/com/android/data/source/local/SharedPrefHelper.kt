package gencana.com.android.data.source.local

import android.content.SharedPreferences
import gencana.com.android.data.entity.Token
import gencana.com.android.data.source.remote.AUTH_TOKEN
import gencana.com.android.data.source.remote.TOKEN_PREFIX
import javax.inject.Inject

/**
 * Created by Gen Cana on 21/10/2018
 */

class SharedPrefHelper @Inject constructor(
        private val sharedPref: SharedPreferences){

    fun saveToken(token: Token){
        saveString(AUTH_TOKEN, "$TOKEN_PREFIX ${token.accessToken}")
    }

    fun getToken(): String?
        = sharedPref.getString(AUTH_TOKEN, null)


    private fun saveString(key: String, value: String){
        sharedPref.edit().putString(key, value).commit()
    }

}