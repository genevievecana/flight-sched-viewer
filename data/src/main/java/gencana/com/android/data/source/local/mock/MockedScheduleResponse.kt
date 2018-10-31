package gencana.com.android.data.source.local.mock

import com.squareup.moshi.Moshi
import gencana.com.android.data.entity.ScheduleResponseData

/**
 * Created by Gen Cana on 31/10/2018
 */

fun getMockedScheduleResponse(moshi: Moshi): ScheduleResponseData?{
    val adapter= moshi.adapter(ScheduleResponseData::class.java)
    return  adapter.fromJson(scheduleResponse)
}


val scheduleResponse = """
    {
  "ScheduleResource": {
    "Schedule": [
      {
        "TotalJourney": {
          "Duration": "P1DT1H15M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T00:50"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "NRT",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T06:10"
              },
              "Terminal": {
                "Name": 3
              }
            },
            "MarketingCarrier": {
              "AirlineID": "GK",
              "FlightNumber": 40
            },
            "Equipment": {
              "AircraftCode": 320
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 1234567,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T11:20"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T15:40"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 4919
            },
            "OperatingCarrier": {
              "AirlineID": "NH"
            },
            "Equipment": {
              "AircraftCode": "77W"
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 1234567,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T17:05"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:05"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1134
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 1234567,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "P1DT4H"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T00:50"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "NRT",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T06:10"
              },
              "Terminal": {
                "Name": 3
              }
            },
            "MarketingCarrier": {
              "AirlineID": "GK",
              "FlightNumber": 40
            },
            "Equipment": {
              "AircraftCode": 320
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 23456,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T12:35"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "MUC",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T16:45"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 4923
            },
            "OperatingCarrier": {
              "AirlineID": "NH"
            },
            "Equipment": {
              "AircraftCode": 789
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 23456,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "MUC",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:50"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:50"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1816
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 23456,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "P1DT4H"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T00:50"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "NRT",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T06:10"
              },
              "Terminal": {
                "Name": 3
              }
            },
            "MarketingCarrier": {
              "AirlineID": "GK",
              "FlightNumber": 40
            },
            "Equipment": {
              "AircraftCode": 320
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 23456,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T12:45"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "MUC",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T16:45"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 715
            },
            "Equipment": {
              "AircraftCode": 359,
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 23456,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "MUC",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:50"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:50"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1816
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 23456,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-11-07"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "P1DT5H10M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T01:00"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "Arrival": {
              "AirportCode": "ICN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T05:50"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "PR",
              "FlightNumber": 466
            },
            "Equipment": {
              "AircraftCode": 332
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-10-31"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "ICN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T15:25"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:00"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 713
            },
            "Equipment": {
              "AircraftCode": 744,
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-10-31"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T23:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1138
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-10-31"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "PT23H55M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T06:15"
              },
              "Terminal": {
                "Name": 3
              }
            },
            "Arrival": {
              "AirportCode": "NRT",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T11:35"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "MarketingCarrier": {
              "AirlineID": "5J",
              "FlightNumber": 5054
            },
            "Equipment": {
              "AircraftCode": 330,
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T15:20"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 717
            },
            "Equipment": {
              "AircraftCode": "74H",
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T23:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1138
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "PT23H55M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T06:15"
              },
              "Terminal": {
                "Name": 3
              }
            },
            "Arrival": {
              "AirportCode": "NRT",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T11:35"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "MarketingCarrier": {
              "AirlineID": "5J",
              "FlightNumber": 5054
            },
            "Equipment": {
              "AircraftCode": 330,
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T15:20"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 717
            },
            "Equipment": {
              "AircraftCode": "74H",
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T23:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1138
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "PT23H35M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T06:35"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "PVG",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T10:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "MU",
              "FlightNumber": 212
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "PVG",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T13:50"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T18:40"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 729
            },
            "Equipment": {
              "AircraftCode": "74H",
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T23:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1138
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "PT21H15M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T08:55"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "Arrival": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T14:00"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "MarketingCarrier": {
              "AirlineID": "NH",
              "FlightNumber": 5334
            },
            "OperatingCarrier": {
              "AirlineID": "PR"
            },
            "Equipment": {
              "AircraftCode": 330,
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T15:20"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 717
            },
            "Equipment": {
              "AircraftCode": "74H",
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T23:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1138
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          }
        ]
      },
      {
        "TotalJourney": {
          "Duration": "PT21H15M"
        },
        "Flight": [
          {
            "Departure": {
              "AirportCode": "MNL",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T08:55"
              },
              "Terminal": {
                "Name": 2
              }
            },
            "Arrival": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T14:00"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "MarketingCarrier": {
              "AirlineID": "PR",
              "FlightNumber": 422
            },
            "Equipment": {
              "AircraftCode": 330,
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "HND",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T15:20"
              },
              "Terminal": {
                "Name": "I"
              }
            },
            "Arrival": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T19:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 717
            },
            "Equipment": {
              "AircraftCode": "74H",
              "OnBoardEquipment": {
                "InflightEntertainment": true,
                "Compartment": [
                  {
                    "ClassCode": "F",
                    "ClassDesc": "FirstClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "C",
                    "ClassDesc": "BusinessClass",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "E",
                    "ClassDesc": "PremiumEconomy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  },
                  {
                    "ClassCode": "Y",
                    "ClassDesc": "Economy",
                    "FlyNet": true,
                    "SeatPower": true,
                    "Usb": true,
                    "LiveTv": true
                  }
                ]
              }
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          },
          {
            "Departure": {
              "AirportCode": "FRA",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T21:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "Arrival": {
              "AirportCode": "BCN",
              "ScheduledTimeLocal": {
                "DateTime": "2018-10-31T23:10"
              },
              "Terminal": {
                "Name": 1
              }
            },
            "MarketingCarrier": {
              "AirlineID": "LH",
              "FlightNumber": 1138
            },
            "Equipment": {
              "AircraftCode": 321
            },
            "Details": {
              "Stops": {
                "StopQuantity": 0
              },
              "DaysOfOperation": 3,
              "DatePeriod": {
                "Effective": "2018-10-31",
                "Expiration": "2018-12-19"
              }
            }
          }
        ]
      }
    ],
    "Meta": {
      "@Version": "1.0.0",
      "Link": [
        {
          "@Href": "https://api.lufthansa.com/v1/operations/schedules/mnl/BCN/2018-10-31?limit=40",
          "@Rel": "self"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/operations/schedules/mnl/BCN/2018-10-30?limit=20&offset=0",
          "@Rel": "previousRange"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/operations/schedules/mnl/BCN/2018-10-31?limit=20&offset=20",
          "@Rel": "next"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/operations/schedules/mnl/BCN/2018-10-31?limit=20&offset=0",
          "@Rel": "nextRange"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/references/airports/{airportCode}",
          "@Rel": "related"
        },
        {
          "@Href": "https://api.lufthansa.com/v1/references/aircraft/{aircraftCode}",
          "@Rel": "related"
        }
      ]
    }
  }
}
""".trimIndent()