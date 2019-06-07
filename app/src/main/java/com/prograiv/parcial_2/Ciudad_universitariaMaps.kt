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
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class Ciudad_universitariaMaps : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var lastLocation: Location

    companion object{
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    override fun onMarkerClick(p0: Marker?) = false
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
        setContentView(R.layout.activity_ciudad_universitaria_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

       // fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
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
        val mUNIVO = LatLng(13.506945,-88.233034)
        map.addMarker(MarkerOptions().position(mUNIVO).title("Ciudad Universitaria"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(mUNIVO, 17f))

        val mAudit = LatLng(13.507060,-88.232218)
        map.addMarker(MarkerOptions().position(mAudit).title("Auditorium"))


        val mFutb = LatLng(13.510026,-88.231573)
        //map.addMarker(MarkerOptions().position(mFutb).title("Cancha de Futbol"))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_futb_round)).anchor(0.0f, 1.0f).position(mFutb).title("Cancha de Futbol"))


        val mFacultad = LatLng(13.507241,-88.233392)
        map.addMarker(MarkerOptions().position(mFacultad).title("Facultad Ingenieria y Arq."))
       // map.moveCamera(CameraUpdateFactory.newLatLng(mFacultad))

        val mCafet = LatLng(13.507247,-88.232155)
        //map.addMarker(MarkerOptions().position(mCafet).title("Cafeteria"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mCafet))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic__round)).anchor(0.0f, 1.0f).position(mCafet).title("Cafeteria"))


        val mPiscina = LatLng(13.507293,-88.231590)
        //map.addMarker(MarkerOptions().position(mPiscina).title("Piscina"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mPiscina))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_piscina_round)).anchor(0.0f, 1.0f).position(mPiscina).title("Piscina"))


        val mProyecS = LatLng(13.507020,-88.233002)
        map.addMarker(MarkerOptions().position(mProyecS).title("Proyeción Social"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mProyecS))

        val mEdificio = LatLng(13.506847,-88.231940)
        map.addMarker(MarkerOptions().position(mEdificio).title("Nuevo Edificio"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mEdificio))

        val mEautos = LatLng(13.507102,-88.234177)
        //map.addMarker(MarkerOptions().position(mEautos).title("Entrada de Automoviles"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mEautos))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_carro_round)).anchor(0.0f, 1.0f).position(mEautos).title("Entrada de Automoviles"))


        val mPeatonal = LatLng(13.506429,-88.232204)
        //map.addMarker(MarkerOptions().position(mPeatonal).title("Entrada Peatonal"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mPeatonal))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_peaton_round)).anchor(0.0f, 1.0f).position(mPeatonal).title("Entrada Peatonal"))

        val mLabHardw = LatLng(13.506542,-88.232026)
        map.addMarker(MarkerOptions().position(mLabHardw).title("Laboratorio de Hardware"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mLabHardw))

        val mBaños1 = LatLng(13.507214,-88.232292)
        map.addMarker(MarkerOptions().position(mBaños1).title("Baños Sanitarios"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mBaños1))

        val mBaños2 = LatLng(13.507071,-88.233075)
        map.addMarker(MarkerOptions().position(mBaños2).title("Baños Sanitarios"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mBaños2))

        val mCafet1 = LatLng(13.507050,-88.233148)
        //map.addMarker(MarkerOptions().position(mCafet1).title("Cafeteria y Fotocopias"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mCafet1))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_print_round)).anchor(0.0f, 1.0f).position(mCafet1).title("Cafeteria y Fotocopias"))


        val mLabFisica = LatLng(13.507071,-88.233174)
        map.addMarker(MarkerOptions().position(mLabFisica).title("Laboratorio de Fisica"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mLabFisica))

        /*val mAulax1 = LatLng(13.5072)
        map.addMarker(MarkerOptions().position(mAulax1).title("Laboratorio de Fisica"))
        map.moveCamera(CameraUpdateFactory.newLatLng(mAulax1))

        val mAulax2 = LatLng(13.507071,-88.233174)
        map.addMarker(MarkerOptions().position(mAulax2).title("Laboratorio de Fisica"))
        map.moveCamera(CameraUpdateFactory.newLatLng(mAulax2))

        val mAulax3 = LatLng(13.507071,-88.233174)
        map.addMarker(MarkerOptions().position(mAulax3).title("Laboratorio de Fisica"))
        map.moveCamera(CameraUpdateFactory.newLatLng(mAulax3))*/

        val mBus = LatLng(13.506093,-88.231968)
        //map.addMarker(MarkerOptions().position(mBus).title("Parada de Autobuses"))
        //map.moveCamera(CameraUpdateFactory.newLatLng(mBus))
        map.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bus_round)).anchor(0.0f, 1.0f).position(mBus).title("Parada de Autobuses"))

        map.setOnMarkerClickListener(this)
        map.uiSettings.isZoomControlsEnabled=true



        val mapSettings = map?.uiSettings
        mapSettings?.isMapToolbarEnabled = true

        setUpMap()


    }

    private fun setUpMap(){
        if (ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
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
