package com.prograiv.parcial_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Ciudad_Universitaria : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudad__universitaria)
    }
    fun FragmentoFacultad(view: View){
        val Fragmeto1 = FragmentFacultad()
        val administrador = supportFragmentManager
        val transaccion =administrador.beginTransaction()
        transaccion.replace(R.id.container,Fragmeto1)
        transaccion.addToBackStack(null)
        transaccion.commit()
    }
    fun FragmentoAulas(view: View){
        val Fragmeto2 = FragmentAulas()
        val administrador = supportFragmentManager
        val transaccion =administrador.beginTransaction()
        transaccion.replace(R.id.container,Fragmeto2)
        transaccion.addToBackStack(null)
        transaccion.commit()
    }
    fun FragmentoAuditorium(view: View){
        val Fragmeto3 = FragmentAuditorium()
        val administrador = supportFragmentManager
        val transaccion =administrador.beginTransaction()
        transaccion.replace(R.id.container,Fragmeto3)
        transaccion.addToBackStack(null)
        transaccion.commit()
    }
    fun Areas(view: View){
        val intent = Intent(this, Areas::class.java)
        startActivity(intent)
    }
}
