package gencana.com.android.flightsched.common.model

/**
 * Created by Gen Cana on 27/10/2018
 */

data class AirportResponseModel(
        val airportResource: AirportResourceModel
): ResponseInterface<AirportResourceModel>{

    override fun getData(): AirportResourceModel
            = airportResource

}

data class AirportResourceModel(
        val airportDetails: List<AirportItemModel>,
        val meta: MetaModel
)

data class AirportItemModel(
        val airports: List<AirportDetailsModel>
)

data class AirportDetailsModel(
        val airportCode: String,
        val coordinate: CoordinateModel,
        val cityCode: String,
        val countryCode: String,
        val name: NamesModel
)

data class CoordinateModel(
        val latitude: Double,
        val longitude: Double
)

data class NamesModel(
        val airportNameList: List<NameModel>?
)

data class NameModel(
        val airportName: String
)