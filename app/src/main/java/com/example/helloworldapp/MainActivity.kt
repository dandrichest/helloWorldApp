package com.example.helloworldapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState: Bundle?)
        setContentView(R.layout.activity_main)

        // Find the TextView by the ID we just added
        val helloText = findViewById<TextView>(R.id.helloTextView)
        
        // Change the text dynamically
        helloText.text = "Hello from Kotlin Code!"
    }
}
