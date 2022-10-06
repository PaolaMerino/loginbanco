package com.example.loginbanco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var et_Nombre: EditText
    private lateinit var et_Contraseña: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_Nombre = findViewById(R.id.et_Nombre)
        et_Contraseña = findViewById(R.id.et_Contraseña)

    }

    fun registrar(Viste: View) {
        val nombre = et_Nombre.text.toString()
        val contraseña = et_Contraseña.text.toString()

        if (nombre.length == 0) {
            Toast.makeText(this, "Debes de ingresar un nombre", Toast.LENGTH_LONG).show()
        }
        if (contraseña.length == 0) {
            Toast.makeText(this, "Debes de ingresar una contraseña", Toast.LENGTH_LONG).show()
        }
        if (nombre.length != 0 && contraseña.length != 0) {
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show()

            if (nombre == "Paola" && contraseña == "1234") {
                Toast.makeText(this, "Bienvenido al sistema bancario $nombre", Toast.LENGTH_LONG)
                    .show()
                val vBanco: Intent = Intent(this, Banco::class.java)
                startActivity(vBanco)
            } else {
                Toast.makeText(this, "Tu usuario o contraseña son erroneas", Toast.LENGTH_LONG)
                    .show()
            }

        }

    }
}