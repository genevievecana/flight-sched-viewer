package gencana.com.android.flightsched.common.extensions

import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

/**
 * Created by Gen Cana on 26/10/2018
 */

fun TextInputLayout.setEmptyInputError(textView: TextView, errorMsg: String){
    error = if (textView.text.toString().trim().isEmpty()) errorMsg
        else{
            isErrorEnabled = false
            null
        }
}