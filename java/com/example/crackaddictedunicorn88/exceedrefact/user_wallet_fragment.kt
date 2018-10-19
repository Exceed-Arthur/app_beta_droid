package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class user_wallet_fragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.user_wallet_fragment, container, false)

        val send_exc: Button? = view.findViewById(R.id.send_exc) as Button
        val send_eth: Button? = view.findViewById(R.id.send_eth) as Button
        val send_btc: Button? = view.findViewById(R.id.send_btc) as Button

        send_exc?.setOnClickListener(this)
        send_eth?.setOnClickListener(this)
        send_btc?.setOnClickListener(this)

        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.send_exc -> {
                // createSendExcFragment()
                (activity as MainActivity).createSendExcFragment()
            }
            R.id.send_btc -> {
                //createSendBtcFragment()
                (activity as MainActivity).createSendBtcFragment()
            }
            R.id.send_eth -> {
                // createSendEthFragment()
                (activity as MainActivity).createSendEthFragment()
            }
        }
    }
}