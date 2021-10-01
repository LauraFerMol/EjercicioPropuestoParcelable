package com.b2.laurafm.ejerciciopropuestoparcelable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Parcelable2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityparcelable2)
        val intento = intent
        findViewById<TextView>(R.id.DatosTextView).text=
            intent.getParcelableExtra<Persona>("DATOS").toString();

        findViewById<Button>(R.id.BotonCerrar).setOnClickListener{
            finish()
        }
    }
}