package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.exc_fragment_confirm_send.*


class confirmSendExcFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.exc_fragment_confirm_send, container, false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val address = arguments!!.getString("address")
        val amount = arguments!!.getString("amount")
        view_confirm_exc_address.text = address
        view_confirm_exc_amount_send.text = amount
    }


}
