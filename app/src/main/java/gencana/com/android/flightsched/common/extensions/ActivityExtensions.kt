package gencana.com.android.flightsched.common.extensions

import android.app.Activity
import android.content.Intent
import android.os.Parcelable

/**
 * Created by Gen Cana on 26/10/2018
 */

inline fun <reified A: Activity>Activity.startNewActivity(key: String, parcelable: Parcelable){
    val intent = Intent(this, A::class.java)
    intent.putExtra(key, parcelable)
    startActivity(intent)
}