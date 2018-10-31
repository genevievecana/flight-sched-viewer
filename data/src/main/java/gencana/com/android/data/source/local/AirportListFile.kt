package gencana.com.android.data.source.local

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import gencana.com.android.data.entity.AirportResponseData

/**
 * Created by Gen Cana on 31/10/2018
 */

fun getAirportList(moshi: Moshi): AirportResponseData?{
    val adapter = moshi.adapter(AirportResponseData::class.java)
    return  adapter.fromJson(airports)
}

val airports = """
    {
  "AirportResource": {
    "Airports": {
      "Airport": [
        {
          "AirportCode": "AAL",
          "Position": {
            "Coordinate": {
              "Latitude": 57.09305556,
              "Longitude": 9.85
            }
          },
          "CityCode": "AAL",
          "CountryCode": "DK",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aalborg"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Copenhagen"
        },
        {
          "AirportCode": "AAR",
          "Position": {
            "Coordinate": {
              "Latitude": 56.30388889,
              "Longitude": 10.62
            }
          },
          "CityCode": "AAR",
          "CountryCode": "DK",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aarhus"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Copenhagen"
        },
        {
          "AirportCode": "ABE",
          "Position": {
            "Coordinate": {
              "Latitude": 40.65472222,
              "Longitude": -75.43833333
            }
          },
          "CityCode": "ABE",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Allentown/Bethl"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "ABJ",
          "Position": {
            "Coordinate": {
              "Latitude": 5.261388889,
              "Longitude": -3.926388889
            }
          },
          "CityCode": "ABJ",
          "CountryCode": "CI",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Abidjan"
            }
          },
          "UtcOffset": 0,
          "TimeZoneId": "Africa/Abidjan"
        },
        {
          "AirportCode": "ABK",
          "Position": {
            "Coordinate": {
              "Latitude": 6.733888889,
              "Longitude": 44.26611111
            }
          },
          "CityCode": "ABK",
          "CountryCode": "ET",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Kabri Dehar"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Addis_Ababa"
        },
        {
          "AirportCode": "ABQ",
          "Position": {
            "Coordinate": {
              "Latitude": 35.04166667,
              "Longitude": -106.6063889
            }
          },
          "CityCode": "ABQ",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Albuquerque International, NM"
            }
          },
          "UtcOffset": -6,
          "TimeZoneId": "America/Denver"
        },
        {
          "AirportCode": "ABV",
          "Position": {
            "Coordinate": {
              "Latitude": 9.006666667,
              "Longitude": 7.263055556
            }
          },
          "CityCode": "ABV",
          "CountryCode": "NG",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Abuja International"
            }
          },
          "UtcOffset": 1,
          "TimeZoneId": "Africa/Lagos"
        },
        {
          "AirportCode": "ABZ",
          "Position": {
            "Coordinate": {
              "Latitude": 57.20194444,
              "Longitude": -2.197777778
            }
          },
          "CityCode": "ABZ",
          "CountryCode": "GB",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aberdeen"
            }
          },
          "UtcOffset": 1,
          "TimeZoneId": "Europe/London"
        },
        {
          "AirportCode": "ACA",
          "Position": {
            "Coordinate": {
              "Latitude": 16.75555556,
              "Longitude": -99.76694444
            }
          },
          "CityCode": "ACA",
          "CountryCode": "MX",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Acapulco - Alvarez International"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Mexico_City"
        },
        {
          "AirportCode": "ACC",
          "Position": {
            "Coordinate": {
              "Latitude": 5.605277778,
              "Longitude": -0.166666667
            }
          },
          "CityCode": "ACC",
          "CountryCode": "GH",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Accra - Kotoka International"
            }
          },
          "UtcOffset": 0,
          "TimeZoneId": "Africa/Accra"
        },
        {
          "AirportCode": "ACE",
          "Position": {
            "Coordinate": {
              "Latitude": 28.94555556,
              "Longitude": -13.60527778
            }
          },
          "CityCode": "ACE",
          "CountryCode": "ES",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Lanzarote"
            }
          },
          "UtcOffset": 1,
          "TimeZoneId": "Atlantic/Canary"
        },
        {
          "AirportCode": "ACK",
          "Position": {
            "Coordinate": {
              "Latitude": 41.25666667,
              "Longitude": -70.05972222
            }
          },
          "CityCode": "ACK",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Nantucket"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "ACT",
          "Position": {
            "Coordinate": {
              "Latitude": 31.61138889,
              "Longitude": -97.22861111
            }
          },
          "CityCode": "ACT",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Waco Municipal"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Chicago"
        },
        {
          "AirportCode": "ACV",
          "Position": {
            "Coordinate": {
              "Latitude": 40.97916667,
              "Longitude": -124.1075
            }
          },
          "CityCode": "ACV",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Arcata/Eureka"
            }
          },
          "UtcOffset": -7,
          "TimeZoneId": "America/Los_Angeles"
        },
        {
          "AirportCode": "ACY",
          "Position": {
            "Coordinate": {
              "Latitude": 39.45666667,
              "Longitude": -74.57777778
            }
          },
          "CityCode": "AIY",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Atlantic City - International"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "ADA",
          "Position": {
            "Coordinate": {
              "Latitude": 36.98361111,
              "Longitude": 35.28083333
            }
          },
          "CityCode": "ADA",
          "CountryCode": "TR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Adana"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Istanbul"
        },
        {
          "AirportCode": "ADB",
          "Position": {
            "Coordinate": {
              "Latitude": 38.29472222,
              "Longitude": 27.16
            }
          },
          "CityCode": "IZM",
          "CountryCode": "TR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Izmir - Adnan Menderes"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Istanbul"
        },
        {
          "AirportCode": "ADD",
          "Position": {
            "Coordinate": {
              "Latitude": 8.977777778,
              "Longitude": 38.79805556
            }
          },
          "CityCode": "ADD",
          "CountryCode": "ET",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Addis Ababa"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Addis_Ababa"
        },
        {
          "AirportCode": "ADK",
          "Position": {
            "Coordinate": {
              "Latitude": 51.88277778,
              "Longitude": -176.6447222
            }
          },
          "CityCode": "ADK",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Adak Island"
            }
          },
          "UtcOffset": -9,
          "TimeZoneId": "America/Adak"
        },
        {
          "AirportCode": "ADL",
          "Position": {
            "Coordinate": {
              "Latitude": -34.94833333,
              "Longitude": 138.5347222
            }
          },
          "CityCode": "ADL",
          "CountryCode": "AU",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Adelaide"
            }
          },
          "UtcOffset": 9.5,
          "TimeZoneId": "Australia/Adelaide"
        },
        {
          "AirportCode": "ADQ",
          "Position": {
            "Coordinate": {
              "Latitude": 57.75416667,
              "Longitude": -152.4833333
            }
          },
          "CityCode": "ADQ",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Kodiak - Kodiak Airport"
            }
          },
          "UtcOffset": -8,
          "TimeZoneId": "America/Anchorage"
        },
        {
          "AirportCode": "ADZ",
          "Position": {
            "Coordinate": {
              "Latitude": 12.58305556,
              "Longitude": -81.71166667
            }
          },
          "CityCode": "ADZ",
          "CountryCode": "CO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "San Andres Island"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Bogota"
        },
        {
          "AirportCode": "AEP",
          "Position": {
            "Coordinate": {
              "Latitude": -34.55888889,
              "Longitude": -58.41583333
            }
          },
          "CityCode": "BUE",
          "CountryCode": "AR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Buenos Aires - Jorge Newbery"
            }
          },
          "UtcOffset": -3,
          "TimeZoneId": "America/Argentina/Buenos_Aires"
        },
        {
          "AirportCode": "AER",
          "Position": {
            "Coordinate": {
              "Latitude": 43.45,
              "Longitude": 39.95666667
            }
          },
          "CityCode": "AER",
          "CountryCode": "RU",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Sochi"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Moscow"
        },
        {
          "AirportCode": "AES",
          "Position": {
            "Coordinate": {
              "Latitude": 62.56111111,
              "Longitude": 6.114166667
            }
          },
          "CityCode": "AES",
          "CountryCode": "NO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alesund"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Oslo"
        },
        {
          "AirportCode": "AEX",
          "Position": {
            "Coordinate": {
              "Latitude": 31.32416667,
              "Longitude": -92.54694444
            }
          },
          "CityCode": "AEX",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alexandria Louisiana"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Chicago"
        },
        {
          "AirportCode": "AGA",
          "Position": {
            "Coordinate": {
              "Latitude": 30.325,
              "Longitude": -9.413055556
            }
          },
          "CityCode": "AGA",
          "CountryCode": "MA",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Agadir"
            }
          },
          "UtcOffset": 1,
          "TimeZoneId": "Africa/Casablanca"
        },
        {
          "AirportCode": "AGH",
          "Position": {
            "Coordinate": {
              "Latitude": 56.29305556,
              "Longitude": 12.8625
            }
          },
          "CityCode": "AGH",
          "CountryCode": "SE",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Helsingborg - Angelholm"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Stockholm"
        },
        {
          "AirportCode": "AGP",
          "Position": {
            "Coordinate": {
              "Latitude": 36.67166667,
              "Longitude": -4.498055556
            }
          },
          "CityCode": "AGP",
          "CountryCode": "ES",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Malaga"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Madrid"
        },
        {
          "AirportCode": "AGS",
          "Position": {
            "Coordinate": {
              "Latitude": 33.36916667,
              "Longitude": -81.96444444
            }
          },
          "CityCode": "AUG",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Augusta, Georgia"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "AGT",
          "Position": {
            "Coordinate": {
              "Latitude": -25.45555556,
              "Longitude": -54.84361111
            }
          },
          "CityCode": "AGT",
          "CountryCode": "PY",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Ciudad del Este - Alejo Garcia"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Asuncion"
        },
        {
          "AirportCode": "AGU",
          "Position": {
            "Coordinate": {
              "Latitude": 21.84833333,
              "Longitude": -102.2883333
            }
          },
          "CityCode": "AGU",
          "CountryCode": "MX",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aguascalientes"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Mexico_City"
        },
        {
          "AirportCode": "AHB",
          "Position": {
            "Coordinate": {
              "Latitude": 18.23861111,
              "Longitude": 42.655
            }
          },
          "CityCode": "AHB",
          "CountryCode": "SA",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Abha"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Asia/Riyadh"
        },
        {
          "AirportCode": "AHO",
          "Position": {
            "Coordinate": {
              "Latitude": 40.63055556,
              "Longitude": 8.288888889
            }
          },
          "CityCode": "AHO",
          "CountryCode": "IT",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alghero"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Rome"
        },
        {
          "AirportCode": "AIA",
          "Position": {
            "Coordinate": {
              "Latitude": 42.05166667,
              "Longitude": -102.8066667
            }
          },
          "CityCode": "AIA",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alliance"
            }
          },
          "UtcOffset": -6,
          "TimeZoneId": "America/Denver"
        },
        {
          "AirportCode": "AJA",
          "Position": {
            "Coordinate": {
              "Latitude": 41.92416667,
              "Longitude": 8.803055556
            }
          },
          "CityCode": "AJA",
          "CountryCode": "FR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Ajaccio"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Paris"
        },
        {
          "AirportCode": "AJL",
          "Position": {
            "Coordinate": {
              "Latitude": 23.74666667,
              "Longitude": 92.80277778
            }
          },
          "CityCode": "AJL",
          "CountryCode": "IN",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aizawl"
            }
          },
          "UtcOffset": 5.5,
          "TimeZoneId": "Asia/Kolkata"
        },
        {
          "AirportCode": "AJU",
          "Position": {
            "Coordinate": {
              "Latitude": -10.98388889,
              "Longitude": -37.07027778
            }
          },
          "CityCode": "AJU",
          "CountryCode": "BR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aracaju"
            }
          },
          "UtcOffset": -3,
          "TimeZoneId": "America/Belem"
        },
        {
          "AirportCode": "AKJ",
          "Position": {
            "Coordinate": {
              "Latitude": 43.67083333,
              "Longitude": 142.4513889
            }
          },
          "CityCode": "AKJ",
          "CountryCode": "JP",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Asahikawa"
            }
          },
          "UtcOffset": 9,
          "TimeZoneId": "Asia/Tokyo"
        },
        {
          "AirportCode": "AKL",
          "Position": {
            "Coordinate": {
              "Latitude": -37.00805556,
              "Longitude": 174.7916667
            }
          },
          "CityCode": "AKL",
          "CountryCode": "NZ",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Auckland - International"
            }
          },
          "UtcOffset": 12,
          "TimeZoneId": "Pacific/Auckland"
        },
        {
          "AirportCode": "ALA",
          "Position": {
            "Coordinate": {
              "Latitude": 47.09277778,
              "Longitude": 81.62777778
            }
          },
          "CityCode": "ALA",
          "CountryCode": "KZ",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Almaty"
            }
          },
          "UtcOffset": 6,
          "TimeZoneId": "Asia/Qyzylorda"
        },
        {
          "AirportCode": "ALB",
          "Position": {
            "Coordinate": {
              "Latitude": 42.74583333,
              "Longitude": -73.80527778
            }
          },
          "CityCode": "ALB",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Albany, NY"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "ALF",
          "Position": {
            "Coordinate": {
              "Latitude": 69.97611111,
              "Longitude": 23.38055556
            }
          },
          "CityCode": "ALF",
          "CountryCode": "NO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alta"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Oslo"
        },
        {
          "AirportCode": "ALG",
          "Position": {
            "Coordinate": {
              "Latitude": 36.36333333,
              "Longitude": 3.215277778
            }
          },
          "CityCode": "ALG",
          "CountryCode": "DZ",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Algiers"
            }
          },
          "UtcOffset": 1,
          "TimeZoneId": "Africa/Algiers"
        },
        {
          "AirportCode": "ALS",
          "Position": {
            "Coordinate": {
              "Latitude": 37.435,
              "Longitude": -105.8666667
            }
          },
          "CityCode": "ALS",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alamosa"
            }
          },
          "UtcOffset": -6,
          "TimeZoneId": "America/Denver"
        },
        {
          "AirportCode": "ALW",
          "Position": {
            "Coordinate": {
              "Latitude": 46.09472222,
              "Longitude": -118.2911111
            }
          },
          "CityCode": "ALW",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Walla Walla"
            }
          },
          "UtcOffset": -7,
          "TimeZoneId": "America/Los_Angeles"
        },
        {
          "AirportCode": "AMA",
          "Position": {
            "Coordinate": {
              "Latitude": 35.22722222,
              "Longitude": -101.7219444
            }
          },
          "CityCode": "AMA",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Amarillo - International"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Chicago"
        },
        {
          "AirportCode": "AMD",
          "Position": {
            "Coordinate": {
              "Latitude": 23.06638889,
              "Longitude": 72.62416667
            }
          },
          "CityCode": "AMD",
          "CountryCode": "IN",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Ahmedabad"
            }
          },
          "UtcOffset": 5.5,
          "TimeZoneId": "Asia/Kolkata"
        },
        {
          "AirportCode": "AMH",
          "Position": {
            "Coordinate": {
              "Latitude": 6.036111111,
              "Longitude": 37.57694444
            }
          },
          "CityCode": "AMH",
          "CountryCode": "ET",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Arba Minch"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Addis_Ababa"
        },
        {
          "AirportCode": "AMI",
          "Position": {
            "Coordinate": {
              "Latitude": -8.56,
              "Longitude": 116.0969444
            }
          },
          "CityCode": "AMI",
          "CountryCode": "ID",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Mataram"
            }
          },
          "UtcOffset": 8,
          "TimeZoneId": "Asia/Makassar"
        },
        {
          "AirportCode": "AMM",
          "Position": {
            "Coordinate": {
              "Latitude": 31.72361111,
              "Longitude": 35.99527778
            }
          },
          "CityCode": "AMM",
          "CountryCode": "JO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Amman - Queen Alia International"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Asia/Amman"
        },
        {
          "AirportCode": "AMS",
          "Position": {
            "Coordinate": {
              "Latitude": 52.30833333,
              "Longitude": 4.768055556
            }
          },
          "CityCode": "AMS",
          "CountryCode": "NL",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Amsterdam - Schiphol"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Amsterdam"
        },
        {
          "AirportCode": "ANC",
          "Position": {
            "Coordinate": {
              "Latitude": 61.16916667,
              "Longitude": -149.9852778
            }
          },
          "CityCode": "ANC",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Anchorage - International"
            }
          },
          "UtcOffset": -8,
          "TimeZoneId": "America/Anchorage"
        },
        {
          "AirportCode": "ANF",
          "Position": {
            "Coordinate": {
              "Latitude": -23.43944444,
              "Longitude": -70.44277778
            }
          },
          "CityCode": "ANF",
          "CountryCode": "CL",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Antofagasta"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Santiago"
        },
        {
          "AirportCode": "ANU",
          "Position": {
            "Coordinate": {
              "Latitude": 17.1375,
              "Longitude": -61.79
            }
          },
          "CityCode": "ANU",
          "CountryCode": "AG",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Antigua - V.C. Bird International"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Antigua"
        },
        {
          "AirportCode": "AOI",
          "Position": {
            "Coordinate": {
              "Latitude": 43.6175,
              "Longitude": 13.36416667
            }
          },
          "CityCode": "AOI",
          "CountryCode": "IT",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Ancona"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Rome"
        },
        {
          "AirportCode": "AOR",
          "Position": {
            "Coordinate": {
              "Latitude": 6.191111111,
              "Longitude": 100.4038889
            }
          },
          "CityCode": "AOR",
          "CountryCode": "MY",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alor Setar"
            }
          },
          "UtcOffset": 8,
          "TimeZoneId": "Asia/Kuala_Lumpur"
        },
        {
          "AirportCode": "APL",
          "Position": {
            "Coordinate": {
              "Latitude": -15.10166667,
              "Longitude": 39.28722222
            }
          },
          "CityCode": "APL",
          "CountryCode": "MZ",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Nampula"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Africa/Maputo"
        },
        {
          "AirportCode": "ARH",
          "Position": {
            "Coordinate": {
              "Latitude": 64.60027778,
              "Longitude": 40.71666667
            }
          },
          "CityCode": "ARH",
          "CountryCode": "RU",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Arkhangelsk"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Moscow"
        },
        {
          "AirportCode": "ARI",
          "Position": {
            "Coordinate": {
              "Latitude": -18.33305556,
              "Longitude": -70.33805556
            }
          },
          "CityCode": "ARI",
          "CountryCode": "CL",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Arica"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Santiago"
        },
        {
          "AirportCode": "ARN",
          "Position": {
            "Coordinate": {
              "Latitude": 59.66194444,
              "Longitude": 17.93388889
            }
          },
          "CityCode": "STO",
          "CountryCode": "SE",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Stockholm"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Stockholm"
        },
        {
          "AirportCode": "ASB",
          "Position": {
            "Coordinate": {
              "Latitude": 37.98166667,
              "Longitude": 58.36083333
            }
          },
          "CityCode": "ASB",
          "CountryCode": "TM",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Ashgabad - S. Turkmenbashy Int'l"
            }
          },
          "UtcOffset": 5,
          "TimeZoneId": "Asia/Ashgabat"
        },
        {
          "AirportCode": "ASE",
          "Position": {
            "Coordinate": {
              "Latitude": 39.22416667,
              "Longitude": -106.8688889
            }
          },
          "CityCode": "ASE",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aspen, CO"
            }
          },
          "UtcOffset": -6,
          "TimeZoneId": "America/Denver"
        },
        {
          "AirportCode": "ASF",
          "Position": {
            "Coordinate": {
              "Latitude": 47.28333333,
              "Longitude": 48.00638889
            }
          },
          "CityCode": "ASF",
          "CountryCode": "RU",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Astrakhan"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Moscow"
        },
        {
          "AirportCode": "ASM",
          "Position": {
            "Coordinate": {
              "Latitude": 15.29333333,
              "Longitude": 38.90888889
            }
          },
          "CityCode": "ASM",
          "CountryCode": "ER",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Asmara"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Asmara"
        },
        {
          "AirportCode": "ASO",
          "Position": {
            "Coordinate": {
              "Latitude": 10.04722222,
              "Longitude": 34.53666667
            }
          },
          "CityCode": "ASO",
          "CountryCode": "ET",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Asosa"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Addis_Ababa"
        },
        {
          "AirportCode": "ASR",
          "Position": {
            "Coordinate": {
              "Latitude": 38.70416667,
              "Longitude": 35.50972222
            }
          },
          "CityCode": "ASR",
          "CountryCode": "TR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Kayseri"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Istanbul"
        },
        {
          "AirportCode": "ASU",
          "Position": {
            "Coordinate": {
              "Latitude": -25.23916667,
              "Longitude": -57.51916667
            }
          },
          "CityCode": "ASU",
          "CountryCode": "PY",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Asuncion"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Asuncion"
        },
        {
          "AirportCode": "ASW",
          "Position": {
            "Coordinate": {
              "Latitude": 23.965,
              "Longitude": 32.82166667
            }
          },
          "CityCode": "ASW",
          "CountryCode": "EG",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aswan"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Cairo"
        },
        {
          "AirportCode": "ATH",
          "Position": {
            "Coordinate": {
              "Latitude": 37.89583333,
              "Longitude": 23.72888889
            }
          },
          "CityCode": "ATH",
          "CountryCode": "GR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Athens Eleftherios Venizelos"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Athens"
        },
        {
          "AirportCode": "ATL",
          "Position": {
            "Coordinate": {
              "Latitude": 33.63666667,
              "Longitude": -84.42805556
            }
          },
          "CityCode": "ATL",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Hartsfield-Jackson Atlanta International Airport GA"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "ATQ",
          "Position": {
            "Coordinate": {
              "Latitude": 31.70694444,
              "Longitude": 74.79722222
            }
          },
          "CityCode": "ATQ",
          "CountryCode": "IN",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Amritsar"
            }
          },
          "UtcOffset": 5.5,
          "TimeZoneId": "Asia/Kolkata"
        },
        {
          "AirportCode": "ATW",
          "Position": {
            "Coordinate": {
              "Latitude": 44.25777778,
              "Longitude": -88.52
            }
          },
          "CityCode": "ATW",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Appleton"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Chicago"
        },
        {
          "AirportCode": "AUA",
          "Position": {
            "Coordinate": {
              "Latitude": 12.50138889,
              "Longitude": -70.01527778
            }
          },
          "CityCode": "AUA",
          "CountryCode": "AW",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Aruba"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Aruba"
        },
        {
          "AirportCode": "AUH",
          "Position": {
            "Coordinate": {
              "Latitude": 24.43305556,
              "Longitude": 54.64888889
            }
          },
          "CityCode": "AUH",
          "CountryCode": "AE",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Abu Dhabi - NADIA International"
            }
          },
          "UtcOffset": 4,
          "TimeZoneId": "Asia/Dubai"
        },
        {
          "AirportCode": "AUS",
          "Position": {
            "Coordinate": {
              "Latitude": 30.29805556,
              "Longitude": -97.70138889
            }
          },
          "CityCode": "AUS",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Austin-Bergstrom International Airport, TX"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Chicago"
        },
        {
          "AirportCode": "AUW",
          "Position": {
            "Coordinate": {
              "Latitude": 44.92333333,
              "Longitude": -89.62305556
            }
          },
          "CityCode": "AUW",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Wausau"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Chicago"
        },
        {
          "AirportCode": "AVL",
          "Position": {
            "Coordinate": {
              "Latitude": 35.435,
              "Longitude": -82.54111111
            }
          },
          "CityCode": "AVL",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Asheville"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "AVP",
          "Position": {
            "Coordinate": {
              "Latitude": 41.33916667,
              "Longitude": -75.72583333
            }
          },
          "CityCode": "AVP",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Scranton - Pennsylvania"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "AXD",
          "Position": {
            "Coordinate": {
              "Latitude": 40.85583333,
              "Longitude": 25.95638889
            }
          },
          "CityCode": "AXD",
          "CountryCode": "GR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Alexandroupolis"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Athens"
        },
        {
          "AirportCode": "AXM",
          "Position": {
            "Coordinate": {
              "Latitude": 4.456388889,
              "Longitude": -75.76805556
            }
          },
          "CityCode": "AXM",
          "CountryCode": "CO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Armenia"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Bogota"
        },
        {
          "AirportCode": "AXT",
          "Position": {
            "Coordinate": {
              "Latitude": 39.61555556,
              "Longitude": 140.2186111
            }
          },
          "CityCode": "AXT",
          "CountryCode": "JP",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Akita"
            }
          },
          "UtcOffset": 9,
          "TimeZoneId": "Asia/Tokyo"
        },
        {
          "AirportCode": "AXU",
          "Position": {
            "Coordinate": {
              "Latitude": 14.14666667,
              "Longitude": 38.77277778
            }
          },
          "CityCode": "AXU",
          "CountryCode": "ET",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Axum"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Addis_Ababa"
        },
        {
          "AirportCode": "AYT",
          "Position": {
            "Coordinate": {
              "Latitude": 36.90555556,
              "Longitude": 30.79055556
            }
          },
          "CityCode": "AYT",
          "CountryCode": "TR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Antalya"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Istanbul"
        },
        {
          "AirportCode": "BAH",
          "Position": {
            "Coordinate": {
              "Latitude": 26.27083333,
              "Longitude": 50.6375
            }
          },
          "CityCode": "BAH",
          "CountryCode": "BH",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Bahrain International"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Asia/Bahrain"
        },
        {
          "AirportCode": "BAL",
          "Position": {
            "Coordinate": {
              "Latitude": 37.93166667,
              "Longitude": 41.11888889
            }
          },
          "CityCode": "BAL",
          "CountryCode": "TR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Batman"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Europe/Istanbul"
        },
        {
          "AirportCode": "BAQ",
          "Position": {
            "Coordinate": {
              "Latitude": 10.89611111,
              "Longitude": -74.77888889
            }
          },
          "CityCode": "BAQ",
          "CountryCode": "CO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Barranquilla"
            }
          },
          "UtcOffset": -5,
          "TimeZoneId": "America/Bogota"
        },
        {
          "AirportCode": "BAV",
          "Position": {
            "Coordinate": {
              "Latitude": 40.66666667,
              "Longitude": 109.9833333
            }
          },
          "CityCode": "BAV",
          "CountryCode": "CN",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Baotou"
            }
          },
          "UtcOffset": 8,
          "TimeZoneId": "Asia/Shanghai"
        },
        {
          "AirportCode": "BBA",
          "Position": {
            "Coordinate": {
              "Latitude": -45.91611111,
              "Longitude": -71.68944444
            }
          },
          "CityCode": "BBA",
          "CountryCode": "CL",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Balmaceda"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/Santiago"
        },
        {
          "AirportCode": "BBI",
          "Position": {
            "Coordinate": {
              "Latitude": 20.24361111,
              "Longitude": 85.82
            }
          },
          "CityCode": "BBI",
          "CountryCode": "IN",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Bhubaneshwar"
            }
          },
          "UtcOffset": 5.5,
          "TimeZoneId": "Asia/Kolkata"
        },
        {
          "AirportCode": "BBK",
          "Position": {
            "Coordinate": {
              "Latitude": -17.83277778,
              "Longitude": 29.1625
            }
          },
          "CityCode": "BBK",
          "CountryCode": "BW",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Kasane"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Africa/Gaborone"
        },
        {
          "AirportCode": "BBO",
          "Position": {
            "Coordinate": {
              "Latitude": 10.38916667,
              "Longitude": 44.94111111
            }
          },
          "CityCode": "BBO",
          "CountryCode": "SO",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Berbera"
            }
          },
          "UtcOffset": 3,
          "TimeZoneId": "Africa/Mogadishu"
        },
        {
          "AirportCode": "BCN",
          "Position": {
            "Coordinate": {
              "Latitude": 41.30277778,
              "Longitude": 2.094444444
            }
          },
          "CityCode": "BCN",
          "CountryCode": "ES",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Barcelona"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Madrid"
        },
        {
          "AirportCode": "BDA",
          "Position": {
            "Coordinate": {
              "Latitude": 32.36527778,
              "Longitude": -64.69
            }
          },
          "CityCode": "BDA",
          "CountryCode": "BM",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Bermuda - Kindley Field"
            }
          },
          "UtcOffset": -3,
          "TimeZoneId": "Atlantic/Bermuda"
        },
        {
          "AirportCode": "BDL",
          "Position": {
            "Coordinate": {
              "Latitude": 41.9375,
              "Longitude": -72.68305556
            }
          },
          "CityCode": "HFD",
          "CountryCode": "US",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Hartford - Bradley International, CT"
            }
          },
          "UtcOffset": -4,
          "TimeZoneId": "America/New_York"
        },
        {
          "AirportCode": "BDO",
          "Position": {
            "Coordinate": {
              "Latitude": -6.901666667,
              "Longitude": 107.5758333
            }
          },
          "CityCode": "BDO",
          "CountryCode": "ID",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Bandung"
            }
          },
          "UtcOffset": 7,
          "TimeZoneId": "Asia/Jakarta"
        },
        {
          "AirportCode": "BDQ",
          "Position": {
            "Coordinate": {
              "Latitude": 22.32916667,
              "Longitude": 73.22083333
            }
          },
          "CityCode": "BDQ",
          "CountryCode": "IN",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Vadodara"
            }
          },
          "UtcOffset": 5.5,
          "TimeZoneId": "Asia/Kolkata"
        },
        {
          "AirportCode": "BDS",
          "Position": {
            "Coordinate": {
              "Latitude": 40.65805556,
              "Longitude": 17.94666667
            }
          },
          "CityCode": "BDS",
          "CountryCode": "IT",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Brindisi"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Rome"
        },
        {
          "AirportCode": "BEG",
          "Position": {
            "Coordinate": {
              "Latitude": 44.81833333,
              "Longitude": 20.31305556
            }
          },
          "CityCode": "BEG",
          "CountryCode": "RS",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Belgrade"
            }
          },
          "UtcOffset": 2,
          "TimeZoneId": "Europe/Belgrade"
        },
        {
          "AirportCode": "BEL",
          "Position": {
            "Coordinate": {
              "Latitude": -1.378888889,
              "Longitude": -48.47555556
            }
          },
          "CityCode": "BEL",
          "CountryCode": "BR",
          "LocationType": "Airport",
          "Names": {
            "Name": {
              "@LanguageCode": "en",
              "${'$'}": "Belem"
            }
          },
          "UtcOffset": -3,
          "TimeZoneId": "America/Belem"
        }
      ]
    },
    "Meta": {
      "@Version": "1.0.0",
      "Link": [
        {
          "@Href": "https://api.lufthansa.com/v1/references/airports/?limit=100&lang=en",
          "@Rel": "self"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/references/airports/?limit=100&lang=en&offset=100",
          "@Rel": "next"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/references/airports/?limit=100&lang=en&offset=1200",
          "@Rel": "last"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/references/cities/{cityCode}",
          "@Rel": "related"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/references/countries/{countryCode}",
          "@Rel": "related"
        }
      ],
      "TotalCount": 1263
    }
  }
}
""".trimIndent()