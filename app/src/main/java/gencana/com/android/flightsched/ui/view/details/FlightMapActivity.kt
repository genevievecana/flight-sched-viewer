package gencana.com.android.flightsched.ui.view.details

import android.graphics.Color
import android.graphics.Point
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import gencana.com.android.flightsched.R
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.LatLng
import gencana.com.android.flightsched.common.constants.KEY_FLIGHT_DATA
import gencana.com.android.flightsched.common.model.FlightScheduleModel

class FlightMapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap

    private lateinit var flightScheduleModel: FlightScheduleModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        flightScheduleModel = intent.getParcelableExtra(KEY_FLIGHT_DATA)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val latLngBounds = listOf(LatLng(-34.0, 151.0), LatLng(2.9321608,122.9007268))
        val boundBuilder = LatLngBounds.Builder()
        latLngBounds.forEach {
            googleMap.addMarker(MarkerOptions().position(it))
            boundBuilder.include(it)
        }

        googleMap.addPolyline(PolylineOptions()
                .width(2f)
                .color(Color.RED)
                .addAll(latLngBounds))

        Point().apply {
            windowManager.defaultDisplay.getSize(this)
            mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(boundBuilder.build(), x, y, 150))
        }

    }

}
