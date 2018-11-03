package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.login_creation_layout.*
import org.ethereum.geth.Geth
import org.ethereum.geth.KeyStore
import org.ethereum.geth.NodeConfig


class AuthActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_creation_layout)
        login_create_button.setOnClickListener(this)
        try {
            val nc = NodeConfig()
            val node = Geth.newNode(filesDir.toString() + "/.ethNode", nc)
            node.start()


            val gethNode = GethNodeHolder.getInstance()
            gethNode.node = node

        } catch (e: Exception) {
            Log.e("error: ", e.message)
            e.printStackTrace()
        }


    }


    fun onBtnCreatePin() {
        val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        val pin_first = pin_enter_box_1.text.toString();
        val pin_two = pin_enter_box_2.text.toString();
        if (pin_first.length != 6) {
            Toast.makeText(this, "6 digits are required", Toast.LENGTH_SHORT).show()
        } else if (pin_two != pin_first) {
            Toast.makeText(this, "Confirmation failed, try again", Toast.LENGTH_SHORT).show()
        } else {
            var user_pin = pin_two
            val editor = prefs.edit();
            editor.putString("user_pin", user_pin)
            editor.commit()
            editor.putBoolean("isApprovedInternally", true)
            editor.commit()
            createAccount()
            startMainActivity()
        }

    }

    fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onClick(p0: View?) {
        onBtnCreatePin();

    }

    fun createAccount() {

        try {
            val gethNodeHolder = GethNodeHolder.getInstance()
            val gethNode = gethNodeHolder.node

            if (gethNode != null) {

                val ks = KeyStore(filesDir.toString() + "/keystore", Geth.LightScryptN, Geth.LightScryptP)
                val newAccount = ks.newAccount("Password")
                val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
                prefs.edit().putString(SharedPreferences.ethAddress, newAccount.address.hex).apply()

                Log.d("account address: ", newAccount.getAddress().getHex())
                gethNodeHolder.account = newAccount

                val account = gethNodeHolder.account
            }
        } catch (e: Exception) {
            Log.d("error: ", e.message)
            e.printStackTrace()
        }

    }

}


