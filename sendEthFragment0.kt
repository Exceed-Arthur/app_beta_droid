package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.btc_fragment_confirm_send.*
import kotlinx.android.synthetic.main.send_btc_layout.*
import kotlinx.android.synthetic.main.send_ether_layout.*


class sendEthFragment0 : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.send_ether_layout, container, false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button_eth_send.setOnClickListener(this)
    }

    fun onBtnSend() {
        val address = eth_address_friend.text.toString();
        val amount = insert_eth_amount_box.text.toString();
        if (address.length == 0) {
            Toast.makeText(activity, "Address is required", Toast.LENGTH_SHORT).show()
        } else if (amount.length == 0) {
            Toast.makeText(activity, "Amount is required", Toast.LENGTH_SHORT).show()
        } else {
            val bundle = Bundle();
            bundle.putString("address", address)
            bundle.putString("amount", amount)
            (activity as MainActivity).createConfirmEthFragment(bundle);
        }
    }


    override fun onClick(p0: View?) {
        onBtnSend();

    }


}
