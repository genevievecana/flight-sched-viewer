package gencana.com.android.flightsched.common.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.view.inputmethod.InputMethodManager

/**
 * Created by Gen Cana on 26/10/2018
 */

inline fun <reified A: Activity>Activity.startNewActivity(key: String, parcelable: Parcelable){
    val intent = Intent(this, A::class.java)
    intent.putExtra(key, parcelable)
    startActivity(intent)
}

fun Activity.hideKeyboard(){
    val inputManager: InputMethodManager =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    currentFocus?.let {
        inputManager.hideSoftInputFromWindow(it.windowToken, InputMethodManager.SHOW_FORCED)
    }

}