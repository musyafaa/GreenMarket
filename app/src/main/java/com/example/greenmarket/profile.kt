package com.example.greenmarket

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intentImageButton : ImageButton = findViewById(R.id.imgbutton1profile)
        intentImageButton.setOnClickListener{ViewGoHome()}

        val intentImageButton2 : ImageButton = findViewById(R.id.imgbutton2profile)
        intentImageButton2.setOnClickListener{ViewGoExplore()}
    }

    private fun ViewGoExplore() {
        val intent = Intent(this, halaman2::class.java)
        startActivity(intent)
    }

    private fun ViewGoHome() {
        val intent = Intent(this, halaman1::class.java)
        startActivity(intent)
    }
}