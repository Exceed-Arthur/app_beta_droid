package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.exc_fragment_confirm_send.*


class confirmSendExcFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.exc_fragment_confirm_send, container, false)
        val cancel_send_exc: Button? = view.findViewById(R.id.cancel_exc_final) as Button
        cancel_send_exc?.setOnClickListener(this)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val address = arguments!!.getString("address")
        val amount = arguments!!.getString("amount")
        view_confirm_exc_address.text = address
        view_confirm_exc_amount_send.text = amount
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cancel_exc_final -> {
                (activity as MainActivity).createWalletFragment()
            }
        }
    }


}
