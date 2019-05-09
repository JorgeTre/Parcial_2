package com.prograiv.parcial_2

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class

Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
    }
    fun openlink(view: View){
        val uri: Uri = Uri.parse("")
        val intent= Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}
