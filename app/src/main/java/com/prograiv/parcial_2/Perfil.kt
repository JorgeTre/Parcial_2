package com.prograiv.parcial_2

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class

Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
    }
    fun openlink(view: View){
        val uri: Uri = Uri.parse("https://github.com/JorgeTre/Parcial_2")
        val intent= Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
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
        }

        return true
    }
}
