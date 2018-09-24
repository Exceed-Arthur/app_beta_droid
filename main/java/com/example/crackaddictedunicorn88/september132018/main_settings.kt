package com.example.crackaddictedunicorn88.september132018

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_settings.*

class main_settings : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                getText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_exchange -> {
                getText(R.string.navigation_exchange)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                getText(R.string.navigation_settings)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_settings)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
