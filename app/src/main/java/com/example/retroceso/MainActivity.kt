package com.example.retroceso

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncambiar = findViewById<Button>(R.id.btncambiar)

        val spOpciones = findViewById<Spinner>(R.id.spOpciones)

        val btnaccion = findViewById<Button>(R.id.btnaccion)

        val opciones = arrayOf("COLOMBIA","BRASIL","ARGENTINA")

        val adap = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones)

        spOpciones.adapter = adap


        //val rootLayout = findViewById<ConstraintLayout>(android.R.id.fondo)
        spOpciones.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                    when (spOpciones.selectedItem.toString()) {
                        "ARGENTINA" -> {
                            Toast.makeText(this@MainActivity, "Seleccionó Argentina", Toast.LENGTH_LONG).show()
                            btncambiar.setBackgroundColor(Color.BLUE)
                        }
                        "BRASIL" -> {
                            Toast.makeText(this@MainActivity, "Seleccionó Brasil", Toast.LENGTH_LONG).show()
                            btncambiar.setBackgroundColor(Color.GREEN)
                        }
                        "COLOMBIA" -> {
                            btncambiar.setBackgroundColor(Color.YELLOW)
                            Toast.makeText(this@MainActivity, "Seleccionó Colombia", Toast.LENGTH_LONG).show()
                        }
                    }
                }


            override fun onNothingSelected(parent: AdapterView<*>?) {
                // En este caso no hacemos nada si no se ha seleccionado nada
            }
        }




        btncambiar.setOnClickListener{
            cambiar()
            finish()
        }

    }

    fun cambiar(){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}