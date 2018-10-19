package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.qr_bitcoin_popup_fragment.*

class qrBitcoinPopupFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.qr_bitcoin_popup_fragment, container, false)

        val closeBtcQrPopupFragment1: Button? = view.findViewById(R.id.close_btc_qr_button) as Button

        closeBtcQrPopupFragment1?.setOnClickListener(this)

        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.close_btc_qr_button -> {
                // createSendExcFragment()
                (activity as MainActivity).createStartQRFragment()
            }
        }
    }
}