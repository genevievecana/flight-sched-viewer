package gencana.com.android.data.source.local.mock


import gencana.com.android.data.entity.*


/**
 * Created by Gen Cana on 31/10/2018
 */

fun getMockedAirportResponse(): AirportResponseData {
    val city2 = AirportDetailsData("ASM",
            PositionData(CoordinateData(41.30277778, 2.094444444)),
            "ASM", "AF", NamesData(listOf(NameData("Asmara"))))

    val city3 = AirportDetailsData("ACC",
            PositionData(CoordinateData(41.30277778, 2.094444444)),
            "ACC", "AF", NamesData(listOf(NameData("Accra - Kotoka International"))))

    return AirportResponseData(
            AirportResourceData(
                    listOf(AirportItemData(
                            listOf(city2, city3))), MetaData(listOf())))


}

