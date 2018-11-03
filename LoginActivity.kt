package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.login_fragment.*


class LoginActivity : AppCompatActivity(), View.OnClickListener {

    var counter: Int = 12;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_fragment)
        startButton.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        if (counter != 0) {
            val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)

            var globalPrompted = global_pin_prompt.text.toString()
            var auth_comparison = prefs.getString("user_pin", "")

            //compare the user pin entry to the saved user pin

            if (globalPrompted.length != 6) {

                Toast.makeText(this, "6 digit PIN is required!", Toast.LENGTH_SHORT).show()
            } else if (!globalPrompted.equals(auth_comparison)) {
                Toast.makeText(this, "Incorrect! " + counter + " Tries left!", Toast.LENGTH_SHORT).show()
                counter = counter - 1
            } else {
                prefs.edit().putBoolean(SharedPreferences.isApprovedInternally, true).apply()
                startMainActivity();
            }
        } else {
            Toast.makeText(this, "Your Password attempt limit is over", Toast.LENGTH_SHORT).show()
        }


    }

    fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }


}


