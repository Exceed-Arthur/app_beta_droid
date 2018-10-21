package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.btc_fragment_confirm_send.*
import kotlinx.android.synthetic.main.eth_fragment_confirm_send.*
import kotlinx.android.synthetic.main.exc_fragment_confirm_send.*


class confirmSendEthFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.eth_fragment_confirm_send, container, false)
        val cancel_send_eth: Button? = view.findViewById(R.id.cancel_eth) as Button
        cancel_send_eth?.setOnClickListener(this)
        return view
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val address = arguments!!.getString("address")
        val amount = arguments!!.getString("amount")
        view_eth_confirm_address.text = address
        view_confirm_eth_amount.text = amount
    }
    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cancel_eth -> {
                (activity as MainActivity).createWalletFragment()
            }
        }
    }
}
