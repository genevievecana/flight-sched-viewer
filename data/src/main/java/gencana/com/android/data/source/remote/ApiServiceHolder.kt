package gencana.com.android.data.source.remote

/**
 * Created by Gen Cana on 21/10/2018
 */

class ApiServiceHolder {

    private var apiService: FlightApiService? = null

    internal fun getApiService(): FlightApiService? {
        return apiService
    }

    internal fun setApiService(apiService: FlightApiService) {
        this.apiService = apiService
    }
}