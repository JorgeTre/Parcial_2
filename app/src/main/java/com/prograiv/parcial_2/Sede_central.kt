package com.prograiv.parcial_2

import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.view.Menu
import android.view.MenuItem
import com.google.android.gms.location.FusedLocationProviderClient

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class Sede_central : AppCompatActivity(), OnMapReadyCallback {


    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var lastLocation: Location

    companion object{
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.perfil ->{
                val intent = Intent(this, Perfil::class.java)
                startActivity(intent)
                return true
            }
            R.id.inicio ->{
                val intent = Intent(this, Areas::class.java)
                startActivity(intent)
                return true
            }
            R.id.cerrar ->{
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                return true
            }
        }

        return true
    }

    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sede_central)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // Add a marker in Sydney and move the camera
        val mSede = LatLng(13.481708,-88.183678)
        map.addMarker(MarkerOptions().position(mSede).title("Sede Central Universidad de Oriente"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(mSede, 19f))

        map.uiSettings.isZoomControlsEnabled=true



        val mapSettings = map?.uiSettings
        mapSettings?.isMapToolbarEnabled = true

        setUpMap()
    }
    private fun setUpMap(){
        if (ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                Sede_central.LOCATION_PERMISSION_REQUEST_CODE
            )
            return
        }

        //map.isMyLocationEnabled = true
        map.mapType=GoogleMap.MAP_TYPE_HYBRID

        /*fusedLocationProviderClient.lastLocation.addOnSuccessListener(this) {

            location ->

            if(location != null){
                lastLocation = location
                val currentLatLong = LatLng(location.latitude, location.longitude)
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLong, 15f))
            }
        }*/

    }
}
