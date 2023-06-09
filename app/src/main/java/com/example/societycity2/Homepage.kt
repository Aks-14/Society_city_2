package com.example.societycity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_homepage)
    }
}