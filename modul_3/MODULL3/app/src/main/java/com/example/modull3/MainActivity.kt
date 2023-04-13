package com.example.modull3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Intent(this, ke2::class.java).also {
                startActivity(it)
            }
        }

        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/qjXzBy5i6r9n6ZrX9")).also {
                startActivity(it)
            }
        }
    }
}