package com.example.inno3app

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button

import kotlinx.android.synthetic.main.activity_cart.*

class cart : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        setSupportActionBar(toolbar)

        val btnOpenhomeActivity : Button = findViewById(R.id.btn_link_cart)
        btnOpenhomeActivity.setOnClickListener{
            val intent = Intent(this, PaymentActivity :: class.java)
            startActivity(intent)
        }
    }

}
