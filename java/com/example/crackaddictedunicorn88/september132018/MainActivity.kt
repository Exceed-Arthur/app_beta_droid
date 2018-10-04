package com.example.crackaddictedunicorn88.september132018

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.settings_layout.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                getText(R.string.title_home)
                setContentView(R.layout.main_activity)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_exchange -> {
                getText(R.string.navigation_exchange)
                setContentView(R.layout.exchange_layout)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                getText(R.string.navigation_settings)
                setContentView(R.layout.exchange_layout)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
