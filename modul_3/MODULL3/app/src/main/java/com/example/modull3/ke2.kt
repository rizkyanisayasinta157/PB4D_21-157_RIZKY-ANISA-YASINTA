package com.example.modull3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ke2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ke2)

        val button = findViewById<Button>(R.id.button3)

        button.setOnClickListener{
            Intent(this, ke3::class.java).also {
                startActivity(it)
            }

        }
    }
}