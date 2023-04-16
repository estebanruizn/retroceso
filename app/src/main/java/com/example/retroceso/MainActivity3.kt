package com.example.retroceso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    override fun onBackPressed() {
        super.onBackPressed()

        startActivity(Intent(this,MainActivity::class.java))
    }

}