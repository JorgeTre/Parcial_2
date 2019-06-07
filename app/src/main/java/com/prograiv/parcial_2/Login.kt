package com.prograiv.parcial_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Login : AppCompatActivity() {

    /*private lateinit var txtEmail: EditText
    private lateinit var txtPassword: EditText

    private var email: String = ""
    private var password: String = ""*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*txtEmail = findViewById(R.id.TxtEmail)
        txtPassword = findViewById(R.id.Txtcontraseña)*/
    }
    fun Areas(view: View){
        val intent = Intent(this, Areas::class.java)
        startActivity(intent)
    }
    fun Crear_Cuenta(view: View){
        val intent = Intent(this, Crear_Cuenta::class.java)
        startActivity(intent)
    }

   /* override fun onStop() {
        super.onStop()

        email = txtEmail.text.toString()
        password = txtPassword.text.toString()
    }

    override fun onResume() {
        super.onResume()
        if(email != null && password != null){
            txtEmail.setText(email)
            txtPassword.setText(password)
        }
    }

    override fun onRestart() {
        super.onRestart()
        if(email != null && password != null){
            txtEmail.setText(email)
            txtPassword.setText(password)
        }
    }*/
}
