package com.example.retroceso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btncambiar = findViewById<Button>(R.id.btncambiar2)

        btncambiar.setOnClickListener{
            cambiar()
            finish()
        }

    }

    fun cambiar(){
        val intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }
}