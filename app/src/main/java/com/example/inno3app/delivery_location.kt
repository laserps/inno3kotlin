package com.example.inno3app

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button

import kotlinx.android.synthetic.main.activity_delivery_location.*

class delivery_location : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_location)
        setSupportActionBar(toolbar)


        val btnOpenhomeActivity : Button = findViewById(R.id.btn_link_tracking)
        btnOpenhomeActivity.setOnClickListener{
            val intent = Intent(this, TrackingActivity :: class.java)
            startActivity(intent)
        }
    }

}
