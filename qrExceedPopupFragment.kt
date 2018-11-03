package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.qr_exc_popup_fragment.*

class qrExceedPopupFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.qr_exc_popup_fragment, container, false)

        val close_exc_qr: Button? = view.findViewById(R.id.close_exc_qr) as Button

        close_exc_qr?.setOnClickListener(this)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        var msg = prefs.getString(SharedPreferences.ethAddress, "0X0000");

        (activity as MainActivity).createEthBitmap(qr_exceed_replace, msg)

    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.close_exc_qr -> {
                // createSendExcFragment()
                (activity as MainActivity).createStartQRFragment()
            }
        }
    }
}