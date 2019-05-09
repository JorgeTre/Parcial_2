package com.prograiv.parcial_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun Areas(view: View){
        val intent = Intent(this, Areas::class.java)
        startActivity(intent)
    }
    fun Crear_Cuenta(view: View){
        val intent = Intent(this, Crear_Cuenta::class.java)
        startActivity(intent)
    }
}
