package com.example.greenmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val intentButtonlogin : Button = findViewById(R.id.button2)
        intentButtonlogin.setOnClickListener{viewlogin()}


    }

    private fun viewlogin() {
        val intent = Intent(this, halaman1::class.java)
        startActivity(intent)
    }
}