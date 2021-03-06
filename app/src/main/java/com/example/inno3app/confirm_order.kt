package com.example.inno3app

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import kotlinx.android.synthetic.main.activity_confirm_order.*
import kotlinx.android.synthetic.main.app_bar_confirm_order.*

class confirm_order : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_order)
        setSupportActionBar(toolbar)

        val confirm : Button = findViewById(R.id.btn_link_ok)
        confirm.setOnClickListener{
            val intent = Intent(this, Receipt :: class.java)
            startActivity(intent)
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.confirm_order, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.activity_history_order -> {
                val intent = Intent(this,history_order::class.java);
                startActivity(intent);
            }
            R.id.activity_cart -> {
                val intent = Intent(this,cart::class.java);
                startActivity(intent);
            }
            R.id.activity_credit -> {
                val intent = Intent(this,Credit::class.java);
                startActivity(intent);
            }
            R.id.activity_login -> {
                val intent = Intent(this,login::class.java);
                startActivity(intent);
            }
            R.id.delivery_location -> {
                val intent = Intent(this,delivery_location::class.java);
                startActivity(intent);
            }
            R.id.GoogleActivity -> {
                val intent = Intent(this,GoogleActivity::class.java);
                startActivity(intent);
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
