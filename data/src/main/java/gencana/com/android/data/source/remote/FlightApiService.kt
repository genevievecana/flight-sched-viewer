package gencana.com.android.data.source.remote

import gencana.com.android.data.BuildConfig
import gencana.com.android.data.entity.ScheduleResponseData
import gencana.com.android.data.entity.Token
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by Gen Cana on 20/10/2018
 */
interface FlightApiService {

    @POST(ENDPOINT_REFRESH_TOKEN)
    @FormUrlEncoded
    fun refreshToken(
            @Header(HEADER_AUTH_TYPE) authType: String = HEADER_AUTH_NONE,
            @Field(FIELD_CLIENT_ID) appKey: String = BuildConfig.APP_KEY,
            @Field(FIELD_CLIENT_SECRET) appSecret: String = BuildConfig.APP_SECRET,
            @Field(FIELD_GRANT_TYPE) grantType: String = GRANT_TYPE
    ): Call<Token>

    @GET(ENDPOINT_FLIGHT_SCHEDULES)
    fun getFlightSchedules(
            @Path(FIELD_ORIGIN) origin: String,
            @Path(FIELD_DESTINATION) destination: String,
            @Path(FIELD_DATE) fromDateTime: String
    ): Single<ScheduleResponseData>
}