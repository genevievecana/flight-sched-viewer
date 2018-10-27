package gencana.com.android.flightsched.common.model


/**
 * Created by Gen Cana on 27/10/2018
 */

data class AirportResponseModel(
        val airportDetails: AirportResourceModel
)

data class AirportResourceModel(
        val airports: List<AirportDetailsModel>,
        val meta: MetaModel
)

data class AirportDetailsModel(
        val airportCode: String,
        val coordinate: CoordinateModel,
        val cityCode: String,
        val countryCode: String,
        val name: NameModel?
)

data class CoordinateModel(
        val latitude: Double,
        val longitude: Double
)

data class NameModel(
        val airportName: String
)