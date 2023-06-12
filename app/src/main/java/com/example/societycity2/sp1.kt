@file:Suppress("DEPRECATION")

package com.example.societycity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class sp1 : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 3000 // 3 seconds delay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp1)


        // Delayed execution to navigate to the next screen
        Handler().postDelayed({
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}



