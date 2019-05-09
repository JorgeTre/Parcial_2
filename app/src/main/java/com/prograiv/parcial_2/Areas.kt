package com.prograiv.parcial_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Areas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areas)
    }
    fun Ciudad_universitaria(view: View){
        val intent = Intent(this, Ciudad_Universitaria::class.java)
        startActivity(intent)
    }
}
