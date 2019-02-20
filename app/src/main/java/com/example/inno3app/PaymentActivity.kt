package com.example.inno3app

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
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
                    }
                R.id.radio_banking ->
                    if (checked) {
                        mycredit.visibility = View.GONE
                        mybanking.visibility = View.VISIBLE
                        mypaypal.visibility = View.GONE
                    }
                R.id.radio_paypal ->
                    if (checked) {
                        mycredit.visibility = View.GONE
                        mybanking.visibility = View.GONE
                        mypaypal.visibility = View.VISIBLE
                    }
            }
        }
    }


}
