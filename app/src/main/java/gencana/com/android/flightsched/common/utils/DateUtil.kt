package gencana.com.android.flightsched.common.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Gen Cana on 23/10/2018
 */

const val FORMAT_DEFAULT_DATETIME = "yyyy-MM-dd'T'hh:mm"
const val FORMAT_DEFAULT_DATE = "yyyy-MM-dd"
const val FORMAT_TIME_12 = "hh:mm a"
const val FORMAT_TIME_24 = "HH:mm"
const val FORMAT_READABLE_DATE= "MMM d, yyyy"
const val FORMAT_READABLE_DATETIME= "MMM d, HH:mm"

fun getCurrentDefaultDate(): String
        = formatDateToString(Date(), FORMAT_DEFAULT_DATE)

fun formatDefaultToTime(dateString: String?)
        = formatStringDate(dateString, FORMAT_TIME_12)

fun formatDefaultToTime24(dateString: String?)
        = formatStringDate(dateString, FORMAT_TIME_24)

fun formatDefaultToReadableDate(dateString: String?)
        = formatStringDate(dateString, FORMAT_READABLE_DATE)

fun formatDefaultToReadableDateTime(dateString: String?)
        = formatStringDate(dateString, FORMAT_READABLE_DATETIME)

fun formatStringDate(dateString: String?, targetFormat: String): String
    = dateString?.let { formatDateToString(convertStringToDate(dateString), targetFormat)} ?: ""


fun convertStringToDate(inputString: String, format: String = FORMAT_DEFAULT_DATETIME): Date
    = SimpleDateFormat(format).parse(inputString)


fun formatDateToString(date: Date, targetFormat: String): String
    = SimpleDateFormat(targetFormat).format(date)
