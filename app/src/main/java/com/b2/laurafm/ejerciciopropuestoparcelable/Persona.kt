package com.b2.laurafm.ejerciciopropuestoparcelable

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity

class Persona():Parcelable{
    var dni:String
    var nombre: String
    var edad : Int

    constructor(parcel: Parcel) : this() {
        dni = parcel.readString()!!
        nombre = parcel.readString()!!
        edad = parcel.readInt()!!
    }

    init {
        dni=""
        nombre =""
        edad=0
    }

    constructor(dni:String,nombre:String,edad:Int) : this() {
        this.dni = dni;
        this.nombre=nombre;
        this.edad=edad;
    }

    override fun toString(): String {
        return "DNI: $dni\nNombre: $nombre\nEdad: $edad\n"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(dni)
        parcel.writeString(nombre)
        parcel.writeInt(edad)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Persona> {
        override fun createFromParcel(parcel: Parcel): Persona {
            return Persona(parcel)
        }

        override fun newArray(size: Int): Array<Persona?> {
            return arrayOfNulls(size)
        }
    }
}