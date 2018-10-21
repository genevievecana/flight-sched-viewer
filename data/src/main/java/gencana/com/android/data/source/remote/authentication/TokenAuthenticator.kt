package gencana.com.android.data.source.remote.authentication

import gencana.com.android.data.source.local.SharedPrefHelper
import gencana.com.android.data.source.remote.HEADER_AUTH
import gencana.com.android.data.source.remote.ApiServiceHolder
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject

/**
 * Created by Gen Cana on 21/10/2018
 */

class TokenAuthenticator @Inject constructor(
        apiServiceHolder: ApiServiceHolder,
        prefHelper: SharedPrefHelper) : Authenticator {

    private var refreshTokenManager = RefreshTokenManager(apiServiceHolder ,prefHelper)

    override fun authenticate(route: Route?, response: Response?): Request? {
        refreshTokenManager.refreshToken()
        if (!refreshTokenManager.isTokenValid()){
            return null
        }
        return response?.request()?.newBuilder()
                ?.header(HEADER_AUTH, refreshTokenManager.getNewToken()!!)
                ?.build()
    }

}