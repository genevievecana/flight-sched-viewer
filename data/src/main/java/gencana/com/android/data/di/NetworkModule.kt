package gencana.com.android.data.di

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import gencana.com.android.data.BuildConfig
import gencana.com.android.data.source.local.SharedPrefHelper
import gencana.com.android.data.source.remote.ApiServiceHolder
import gencana.com.android.data.source.remote.adapter.ApplicationJsonAdapterFactory
import gencana.com.android.data.source.remote.FlightApiService
import gencana.com.android.data.source.remote.adapter.SingleToArrayAdapter
import gencana.com.android.data.source.remote.authentication.AuthInterceptor
import gencana.com.android.data.source.remote.authentication.TokenAuthenticator
import io.reactivex.Scheduler
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideTokenAuthenticator(
            apiServiceHolder: ApiServiceHolder,
            prefHelper: SharedPrefHelper
    ): TokenAuthenticator
            = TokenAuthenticator(apiServiceHolder, prefHelper)

    @Provides
    @Singleton
    fun providesOkHttpClient(
            tokenAuthenticator: TokenAuthenticator,
            authInterceptor: AuthInterceptor
    ): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
                .authenticator(tokenAuthenticator)
                .addInterceptor(authInterceptor)
        if (BuildConfig.DEBUG){
            okHttpClient.addInterceptor(HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY))
        }
        return okHttpClient.build()
    }

    @Provides
    @Singleton
    fun providesAdapterFactory(io: Scheduler)
            : RxJava2CallAdapterFactory
            = RxJava2CallAdapterFactory.createWithScheduler(io)

    @Provides
    @Singleton
    fun providesMoshi(): Moshi
            = Moshi.Builder()
                .add(SingleToArrayAdapter.FACTORY)
                .add(ApplicationJsonAdapterFactory.INSTANCE)
                .build()

    @Provides
    @Singleton
    fun providesConverterFactory(moshi: Moshi): Converter.Factory
            = MoshiConverterFactory.create(moshi)

    @Provides
    @Singleton
    fun providesRetrofit(
            converterFactory: Converter.Factory,
            rxJava2CallAdapterFactory: RxJava2CallAdapterFactory,
            okHttpClient: OkHttpClient
    ): Retrofit
            = Retrofit.Builder().baseUrl(BuildConfig.API_BASE_URL)
            .addConverterFactory(converterFactory)
            .addCallAdapterFactory(rxJava2CallAdapterFactory)
            .client(okHttpClient)
            .build()


    @Provides
    @Singleton
    fun apiServiceHolder(): ApiServiceHolder {
        return ApiServiceHolder()
    }

    @Provides
    @Singleton
    fun providesApiService(
            retrofit: Retrofit,
            apiServiceHolder: ApiServiceHolder
    ): FlightApiService{
        val flightApiService = retrofit.create(FlightApiService::class.java)
        apiServiceHolder.setApiService(flightApiService)
        return flightApiService
    }


}