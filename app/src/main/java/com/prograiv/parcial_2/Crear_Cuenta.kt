package com.prograiv.parcial_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Crear_Cuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear__cuenta)
    }
    fun Login(view: View){
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}
