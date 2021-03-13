package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miLista = findViewById<ListView>(R.id.lista)

        miLista.adapter = miAdaptador(this)

    }


    private class miAdaptador(contexto: Context) : BaseAdapter() {


        private val miContexto: Context


        init {

            miContexto = contexto

        }


//genera cada una de las filas

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(miContexto)
            val listRowLayout = layoutInflater.inflate(R.layout.lista_fila, parent, false)

            val imagen = listRowLayout.findViewById<ImageView>(R.id.miImagen)
            val textview1 = listRowLayout.findViewById<TextView>(R.id.miTextView1)
            val textview2 = listRowLayout.findViewById<TextView>(R.id.miTextView2)

            textview1.text = "Hola, maestra $position"
            textview2.text = "Saludos maestra $position"

            return listRowLayout

        }


        override fun getItem(position: Int): Any {

            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        }


//regresa el id de cada elemento de la lista

        override fun getItemId(position: Int): Long {

            return position.toLong()

        }


// cuántas filas genera

        override fun getCount(): Int {

            return 30

        }


    }


}