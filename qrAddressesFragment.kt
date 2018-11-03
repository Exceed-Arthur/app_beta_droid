package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

import android.content.Context.CLIPBOARD_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import android.view.Gravity
import android.widget.Toast
import android.support.v4.content.ContextCompat.getSystemService

import android.content.ClipData
import android.content.ClipboardManager

class qrAddressesFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.qr_addresses_fragment, container, false)
        val ethAddressCopy: Button? = view.findViewById(R.id.eth_copy_button) as Button
        val excAddressCopy: Button? = view.findViewById(R.id.copy_button_exc) as Button
        val btcAddressCopy: Button? = view.findViewById(R.id.copy_address_btc) as Button

        ethAddressCopy?.setOnClickListener(this)
        excAddressCopy?.setOnClickListener(this)
        btcAddressCopy?.setOnClickListener(this)


        val qr_image_button_btc2: ImageButton? = view.findViewById(R.id.qr_image_button_btc2) as ImageButton
        val qr_image_eth: ImageButton? = view.findViewById(R.id.qr_image_eth) as ImageButton
        val qr_button_exc: ImageButton? = view.findViewById(R.id.qr_button_exc) as ImageButton

        qr_image_button_btc2?.setOnClickListener(this)
        qr_image_eth?.setOnClickListener(this)
        qr_button_exc?.setOnClickListener(this)

        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.qr_image_button_btc2 -> {
                //createQrBitcoinPopupFragment()
                (activity as MainActivity).createQrBitcoinPopupFragment()
            }
            R.id.qr_image_eth -> {
                //createQrEthPopupFragment()
                (activity as MainActivity).createQrEthPopupFragment()
            }
            R.id.qr_button_exc -> {
                // createQrExcPopupFragment()
                (activity as MainActivity).createQrExcPopupFragment()
            }
            R.id.copy_button_exc -> {
                // copy Exc Address()
                (activity as MainActivity).copyEthAddress()
            }
            R.id.copy_address_btc -> {
                // copy Btc Address()
                (activity as MainActivity).copyBtcAddress()
            }
            R.id.eth_copy_button -> {
                // copy Eth Address()
                (activity as MainActivity).copyEthAddress()
            }
        }
    }
}