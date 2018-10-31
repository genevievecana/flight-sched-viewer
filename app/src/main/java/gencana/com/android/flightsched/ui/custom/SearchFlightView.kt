package gencana.com.android.flightsched.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ArrayAdapter
import androidx.coordinatorlayout.widget.CoordinatorLayout
import gencana.com.android.domain.model.FlightScheduleParams
import gencana.com.android.flightsched.R
import gencana.com.android.flightsched.common.extensions.setEmptyInputError
import gencana.com.android.flightsched.common.utils.getCurrentDefaultDate
import kotlinx.android.synthetic.main.view_search_flight.view.*

/**
 * Created by Gen Cana on 26/10/2018
 */

class SearchFlightView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : CoordinatorLayout(context, attrs, defStyleAttr), BaseView<Nothing> {

    interface SearchListener {

        fun onSearchClicked(searchParams: FlightScheduleParams)
    }

    private lateinit var autoCompleteAdapter: ArrayAdapter<String>

    private val inputList = ArrayList<String>()

    private val view = setupView(this)

    var searchListener: SearchListener? = null

    override fun postSetup(view: View) {
        autoCompleteAdapter = ArrayAdapter(context, android.R.layout.select_dialog_singlechoice, inputList)
        auto_search_from.setAdapter(autoCompleteAdapter)
        auto_search_to.setAdapter(autoCompleteAdapter)
        view.btn_search.setOnClickListener {
            getSearchParameters()
                    ?.let { it1 -> searchListener?.onSearchClicked(it1) }

        }
        auto_search_from.setOnItemClickListener { parent, view, position, id ->
            auto_search_from.setText((parent.getItemAtPosition(position) as String).substring(0, 3))
        }

        auto_search_to.setOnItemClickListener { parent, view, position, id ->
            auto_search_to.setText((parent.getItemAtPosition(position) as String).substring(0, 3))
        }
    }

    fun addAutoCompleteList(list: List<String>){
        inputList.clear()
        inputList.addAll(list)
        autoCompleteAdapter.notifyDataSetChanged()
    }

    override fun getLayout(): Int = R.layout.view_search_flight

    fun getSearchParameters(): FlightScheduleParams?{
        return if (validateFields()) FlightScheduleParams(view.auto_search_from.text.toString(),
                view.auto_search_to.text.toString(), getCurrentDefaultDate())
        else null
    }

    private fun validateFields(): Boolean{
        view.til_from.setEmptyInputError(
                view.auto_search_from.length() != 3,
                view.auto_search_from,
                String.format(context.getString(R.string.invalid_field), context.getString(R.string.origin)))

        view.til_to.setEmptyInputError(
                view.auto_search_to.length() != 3,
                view.auto_search_to,
                String.format(context.getString(R.string.invalid_field), context.getString(R.string.destination)))

        return view.til_from.error == null && view.til_to.error == null
    }

}