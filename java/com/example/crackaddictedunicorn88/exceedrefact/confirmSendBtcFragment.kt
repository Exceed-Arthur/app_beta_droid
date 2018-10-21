package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.btc_fragment_confirm_send.*
import kotlinx.android.synthetic.main.exc_fragment_confirm_send.*


class confirmSendBtcFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.btc_fragment_confirm_send, container, false)
        val cancel_send_btc: Button? = view.findViewById(R.id.cancel_btc_send_final) as Button
        cancel_send_btc?.setOnClickListener(this)
        return view
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val address = arguments!!.getString("address")
        val amount = arguments!!.getString("amount")
        view_btc_address_confirm.text = address
        view_edit_btc_send_amount.text = amount
    }
    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cancel_btc_send_final -> {

                (activity as MainActivity).createWalletFragment()
            }
        }
    }
}
