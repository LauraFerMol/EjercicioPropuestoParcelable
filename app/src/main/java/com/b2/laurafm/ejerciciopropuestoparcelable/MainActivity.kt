package com.b2.laurafm.ejerciciopropuestoparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.BotonMandar).setOnClickListener {
            val dni:String = findViewById<EditText>(R.id.DniTexto).text.toString()
            val nombre:String = findViewById<EditText>(R.id.NombreTexto).text.toString()
            val edad:Int = findViewById<EditText>(R.id.EdadTexto).text.toString().toInt()

            val intento = Intent(applicationContext,Parcelable2Activity::class.java)
            intento.putExtra("DATOS",Persona(dni,nombre,edad))
            startActivity(intento)

        }
    }
}