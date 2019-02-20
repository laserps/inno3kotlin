package com.example.inno3app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.Button

import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(toolbar)
        val btnOpenPageregister : Button = findViewById(R.id.link_page_login)
        btnOpenPageregister.setOnClickListener{
            val intent = Intent(this, Usernamre :: class.java)
            startActivity(intent)
        }
    }

}
