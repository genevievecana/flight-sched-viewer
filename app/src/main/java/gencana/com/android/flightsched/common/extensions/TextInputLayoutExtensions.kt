package gencana.com.android.flightsched.common.extensions

import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

/**
 * Created by Gen Cana on 26/10/2018
 */


fun TextInputLayout.setEmptyInputError(forceError: Boolean = false, textView: TextView, errorMsg: String){
    error = if (textView.text.toString().trim().isEmpty() || forceError) errorMsg
    else{
        isErrorEnabled = false
        null
    }
}