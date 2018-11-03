package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_one)
    }


    override fun onResume() {
        super.onResume()
        timer.start();
    }

    override fun onPause() {
        super.onPause()
        timer.cancel()
    }

    var timer = object : CountDownTimer(2000, 2000) {
        override fun onTick(millisUntilFinished: Long) {
        }

        override fun onFinish() {
            navigateToMain()
        }
    }

    fun navigateToMain() {
        val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        val password=prefs.getString("user_pin","");
        if(password==null || password.equals("")) {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}


