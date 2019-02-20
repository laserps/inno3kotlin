package com.example.inno3app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.Toast



class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnOpenActivity : Button = findViewById(R.id.btn_link_username)
        btnOpenActivity.setOnClickListener{
            val intent = Intent(this, Usernamre :: class.java)
            startActivity(intent)
        }

        val btnOpenregisterActivity : Button = findViewById(R.id.btn_link_register)
        btnOpenregisterActivity.setOnClickListener{
            val intent = Intent(this, RegisterActivity :: class.java)
            startActivity(intent)
        }

        val btnOpenhomeActivity : Button = findViewById(R.id.btn_link_home)
        btnOpenhomeActivity.setOnClickListener{
            val intent = Intent(this, HomeActivity :: class.java)
            startActivity(intent)
        }


    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }
    private fun hideSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }


}
