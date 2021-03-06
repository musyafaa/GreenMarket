package com.example.greenmarket

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class halaman1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman1)

        val intentImageButtonExplore : ImageButton = findViewById(R.id.imgbutton2hlmn1)
        intentImageButtonExplore.setOnClickListener{ViewExplore()}

        val intentImageButtonProfile : ImageButton = findViewById(R.id.imgbutton4hlmn1)
        intentImageButtonProfile.setOnClickListener{ViewProfile()}

        val intentImageButtonPesan : ImageView = findViewById(R.id.letter)
        intentImageButtonPesan.setOnClickListener{ViewPesan()}

        val intentImageButtonNotif : ImageView = findViewById(R.id.bell)
        intentImageButtonNotif.setOnClickListener{ViewNotif()}

    }

    private fun ViewNotif() {
        val intent = Intent(this, notif::class.java)
        startActivity(intent)
    }

    private fun ViewPesan() {
        val intent = Intent(this, pesan::class.java)
        startActivity(intent)
    }

    private fun ViewProfile() {
        val intent = Intent(this, profile::class.java)
        startActivity(intent)
    }

    private fun ViewExplore() {
        val intent = Intent(this, halaman2::class.java)
        startActivity(intent)
    }
}