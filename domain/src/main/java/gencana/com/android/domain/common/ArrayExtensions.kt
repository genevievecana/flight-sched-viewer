package gencana.com.android.domain.common

/**
 * Created by Gen Cana on 20/10/2018
 */

fun Array<String?>.hasNullOrEmpty(): Boolean{
    for (item in this){
        if (item.isNullOrEmpty()){
            return true
        }
    }

    return false
}