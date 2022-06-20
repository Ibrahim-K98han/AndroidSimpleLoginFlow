package com.ibrahim.loginflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var msgTV: TextView
    private lateinit var nameMsTv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        msgTV = findViewById(R.id.welcomeMsgTV)
        nameMsTv = findViewById(R.id.nameMsgTV)
        val email = intent.getStringExtra("email_value")
        val name = intent.getStringExtra("name_value")
        msgTV.text = "Welcome, $email"
        nameMsTv.text = "Name : $name"
    }
}