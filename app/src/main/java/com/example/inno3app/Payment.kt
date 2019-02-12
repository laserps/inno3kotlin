package com.example.inno3app

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ExpandableListView
import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.app_bar_payment.*
import java.lang.Exception

class Payment : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var expListView: ExpandableListView
    lateinit var chapterList:MutableList<chapter>
    var sectionList: MutableList<section> = ArrayList()
    lateinit var Chapter_Name: Array<String>
    lateinit var Section_Name: Array<String>
    lateinit var c: chapter
    lateinit var s: section
    lateinit var ListAdapter: MyListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        setSupportActionBar(toolbar)

        chapterList = ArrayList()
        prepareListData()

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    private fun prepareListData() {
        Chapter_Name = resources.getStringArray(R.array.chapter)
        for (i in 0..Chapter_Name.size - 1)
        {
            var k: String = "chapter${i + 1})"
            var id: Int = resources.getIdentifier(k,"array",this.packageName)
            try {
                Section_Name = resources.getStringArray(id)
            }catch (e: Exception)
            {
                Section_Name = arrayOf()
            }
            for (j in 0..Section_Name.size - 1)
            {
                c = chapter(Section_Name[j])
                chapterList.add(c)
            }
            s = section(Chapter_Name[i],chapterList)
            sectionList.add(s)
            chapterList = ArrayList()
        }
        displayList()
    }

    private fun displayList() {
       expListView = findViewById(R.id.lvExp) as  ExpandableListView
       ListAdapter = MyListAdapter(this,sectionList)
        expListView.setAdapter(ListAdapter)
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
        menuInflater.inflate(R.menu.payment, menu)
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
            R.id.activity_credit -> {
                val intent = Intent(this,Credit::class.java);
                startActivity(intent);
            }
            R.id.activity_login -> {
                val intent = Intent(this,login::class.java);
                startActivity(intent);
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
