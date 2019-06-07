package com.prograiv.parcial_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Mostrar_Facultad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar__facultad)
    }
    fun Ciudad_universitaria(view: View) {
        val intent = Intent(this, sin_conexion::class.java)
        startActivity(intent)
    }
}
