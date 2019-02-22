package com.example.inno3app

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button

import kotlinx.android.synthetic.main.activity_usernamre.*

class Usernamre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_usernamre)
        setSupportActionBar(toolbar)
        val btnOpenPagehome : Button = findViewById(R.id.link_home_login)
        btnOpenPagehome.setOnClickListener{
            val intent = Intent(this, HomeActivity :: class.java)
            startActivity(intent)
        }
    }


}
