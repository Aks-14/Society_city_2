package com.example.societycity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_homepage)

        val nextButton: Button = findViewById(R.id.button3)

        // Set a click listener for the button
        nextButton.setOnClickListener {
            // Create an intent to navigate to the next activity
            val intent = Intent(this, Fragment_design::class.java)
            startActivity(intent)
        }
    }
}