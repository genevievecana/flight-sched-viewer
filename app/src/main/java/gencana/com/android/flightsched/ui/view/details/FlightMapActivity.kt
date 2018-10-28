package gencana.com.android.flightsched.ui.view.details

import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import gencana.com.android.flightsched.R
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.LatLng
import gencana.com.android.flightsched.common.constants.KEY_FLIGHT_DATA
import gencana.com.android.flightsched.common.extensions.show
import gencana.com.android.flightsched.common.model.AirportDetailsModel
import gencana.com.android.flightsched.common.model.FlightScheduleModel
import gencana.com.android.flightsched.ui.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_details.*

class FlightMapActivity : BaseActivity<FlightMapViewModel, List<AirportDetailsModel>>(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null

    private val airportCodesSet by lazy {
        val airportCodes = LinkedHashSet<String>()
        intent.getParcelableExtra<FlightScheduleModel>(KEY_FLIGHT_DATA).flight.forEach {
            airportCodes.add(it.departure.airportCode)
            airportCodes.add(it.arrival.airportCode)
        }
        airportCodes
    }

    override val layout: Int
        get() = R.layout.activity_details

    override fun setupActivity(savedInstanceState: Bundle?) {
        view_placeholder.setMainView(frame_map)
        view_placeholder.setImageActionListener {getAirportDetails()}
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        getAirportDetails()
    }

    private fun getAirportDetails(){
        viewModel.getAirportDetails(airportCodesSet)
    }

    override fun showLoading(show: Boolean) {
        view_placeholder.showLoading(show)
    }

    override fun onResponseSuccess(data: List<AirportDetailsModel>) {
        view_placeholder.hideError()
        drawMap(data)
    }

    override fun onError(errorMsg: String?) {
        view_placeholder.showError(null)
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show()
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
    }

    private fun drawMap(airportList: List<AirportDetailsModel>){
        val markerIcon = BitmapDescriptorFactory.fromResource(R.drawable.ic_local_airport)
        val color = ContextCompat.getColor(this, R.color.primaryDark)

        airportList
                .map { LatLng(it.coordinate.latitude, it.coordinate.longitude)}
                .apply { mMap?.addPolyline(PolylineOptions().addAll(this).color(color).width(3f))}

        LatLngBounds.builder().apply {
            for (item in airportList) {
                LatLng(item.coordinate.latitude, item.coordinate.longitude).apply {
                    val marker = MarkerOptions()
                            .position(LatLng(item.coordinate.latitude, item.coordinate.longitude))
                            .title(item.name.airportNameList?.firstOrNull()?.airportName ?: "")
                            .icon(markerIcon)
                    mMap?.addMarker(marker)
                    include(marker.position)
                }
            }
            mMap?.moveCamera(CameraUpdateFactory.newLatLngBounds(this.build(), 120))
        }

    }

}
