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
import java.net.URL
import android.content.Intent
import android.net.Uri


open class MainActivity : AppCompatActivity() {

    fun createStartQRFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrAddressesFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
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

    fun createQrBitcoinPopupFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrBitcoinPopupFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun createQrEthPopupFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrEthPopupFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun createQrExcPopupFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrExceedPopupFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun openForkUSDT(){
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun openForkETH() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun openForkBTC() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun openTJUSDT() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun openTJETH() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun openTJBTC() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun open0XUSDT() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun open0XETH() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
    fun open0xBTC() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
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
