package com.example.inno3app

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Button
import android.widget.RadioButton

import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.content_payment.*

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        setSupportActionBar(toolbar)
        mybanking.visibility = View.GONE
        mypaypal.visibility = View.GONE
        radio_credit.setBackgroundResource(R.drawable.solid_checked)
        radio_banking.setBackgroundResource(R.drawable.solid_notchecked)
        radio_paypal.setBackgroundResource(R.drawable.solid_notchecked)

        val btnOpenhomeActivity : Button = findViewById(R.id.btn_link_confirm1)
        btnOpenhomeActivity.setOnClickListener{
            val intent = Intent(this, confirm_order :: class.java)
            startActivity(intent)
        }
        val btnconfirmActivity1 : Button = findViewById(R.id.btn_link_confirm2)
        btnconfirmActivity1.setOnClickListener{
            val intent = Intent(this, confirm_order :: class.java)
            startActivity(intent)
        }
        val btnconfirmActivity2 : Button = findViewById(R.id.btn_link_confirm3)
        btnconfirmActivity2.setOnClickListener{
            val intent = Intent(this, confirm_order :: class.java)
            startActivity(intent)
        }
    }
    fun  onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked


            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_credit ->
                    if (checked) {
                        mycredit.visibility = View.VISIBLE
                        mybanking.visibility = View.GONE
                        mypaypal.visibility = View.GONE
                        radio_credit.setBackgroundResource(R.drawable.solid_checked)
                        radio_banking.setBackgroundResource(R.drawable.solid_notchecked)
                        radio_paypal.setBackgroundResource(R.drawable.solid_notchecked)
                    }
                R.id.radio_banking ->
                    if (checked) {
                        mycredit.visibility = View.GONE
                        mybanking.visibility = View.VISIBLE
                        mypaypal.visibility = View.GONE
                        radio_credit.setBackgroundResource(R.drawable.solid_notchecked)
                        radio_banking.setBackgroundResource(R.drawable.solid_checked)
                        radio_paypal.setBackgroundResource(R.drawable.solid_notchecked)
                    }
                R.id.radio_paypal ->
                    if (checked) {
                        mycredit.visibility = View.GONE
                        mybanking.visibility = View.GONE
                        mypaypal.visibility = View.VISIBLE
                        radio_credit.setBackgroundResource(R.drawable.solid_notchecked)
                        radio_banking.setBackgroundResource(R.drawable.solid_notchecked)
                        radio_paypal.setBackgroundResource(R.drawable.solid_checked)
                    }
            }
        }
    }


}
