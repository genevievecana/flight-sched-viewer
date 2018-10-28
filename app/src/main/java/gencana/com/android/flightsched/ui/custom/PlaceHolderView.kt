package gencana.com.android.flightsched.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.extensions.show
import kotlinx.android.synthetic.main.view_placeholder.view.*

/**
 * Created by Gen Cana on 28/10/2018
 */

class PlaceHolderView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), BaseView<Nothing> {

    private var view: View = setupView(this)
    private var mainView: View? = null

    fun setMainView(view: View){
        mainView = view
    }

    fun setImageActionListener(clickAction: () -> Unit) {
        view.img_retry.setOnClickListener {
            clickAction.invoke() }
    }

    fun showLoading(show: Boolean){
        view.apply {
            img_retry.show(false)
            txt_placeholder.show(false)
            progress_bar.show(show)
        }
        show(show)
    }

    fun showEmpty(message: String?){
        mainView?.show(false)
        show()
        view.apply {
            img_retry.show(false)
            txt_placeholder.apply {
                text = message ?: context.getString(R.string.error_empty)
                show()
            }
        }
    }

    fun showError(message: String?){
        mainView?.show(false)
        show()
        view.apply {
            txt_placeholder.apply {
                text = message ?: context.getString(R.string.error_default)
                show()
            }
            img_retry.show()
        }
    }

    fun hideError(){
        mainView?.show()
        show(false)
        view.apply {
            img_retry.show(false)
            txt_placeholder.apply {
                text = ""
                show(false)
            }
        }
    }

    override fun getLayout(): Int = R.layout.view_placeholder

}