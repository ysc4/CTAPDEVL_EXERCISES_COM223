package com.example.exercise2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("USERNAME")
        val usernameTextView = findViewById<TextView>(R.id.usernameText)
        usernameTextView.text = "$username"
    }
}
