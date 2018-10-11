package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    fun createStartQRFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrAddressesFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createButtonMyAddy() {
        val button: Button = findViewById(R.id.send_btc)
        button.setOnClickListener {
            createStartQRFragment()
        }
    }

    fun createexchangeFragment() {
        val transaction = manager.beginTransaction()
        val fragment = exchangeFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createSettingsFragment() {
        val transaction = manager.beginTransaction()
        val fragment = settingsFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun creategenPrefFragment0() {
        val transaction = manager.beginTransaction()
        val fragment = genPrefFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun createrecovery_backup_1_fragment() {
        val transaction = manager.beginTransaction()
        val fragment = recoveryBackup1Fragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createprefNotificationFragment() {
        val transaction = manager.beginTransaction()
        val fragment = prefNotificationFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }








    fun createWalletFragment() {
        val transaction = manager.beginTransaction()
        val fragment = user_wallet_fragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createButtonSendExcFragment() {
        val button: Button = findViewById(R.id.send_exc)
        button.setOnClickListener {
            createSendExcFragment()
        }
    }

    // Send Fragments

    fun createSendExcFragment() {
        val transaction = manager.beginTransaction()
        val fragment = sendExcFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createSendBtcFragment() {
        val transaction = manager.beginTransaction()
        val fragment = sendBtcFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createSendEthFragment() {
        val transaction = manager.beginTransaction()
        val fragment = sendEthFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    val manager = supportFragmentManager

    private val mOnNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                createWalletFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_exchange -> {
                createexchangeFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                createSettingsFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_recieve -> {
                createStartQRFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentholder, user_wallet_fragment())
        fragmentTransaction.commit()
    }
}