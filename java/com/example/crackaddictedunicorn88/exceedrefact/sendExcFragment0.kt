package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.send_exc_layout.*


class sendExcFragment0 : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.send_exc_layout, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        exc_send_button.setOnClickListener(this)
    }

    fun onBtnSend() {
        val address = address_exc_window.text.toString();
        val amount = amount_send_exc.text.toString();
        if (address.length == 0) {
            Toast.makeText(activity, "Address is required", Toast.LENGTH_SHORT).show()
        } else if (amount.length == 0) {
            Toast.makeText(activity, "Amount is required", Toast.LENGTH_SHORT).show()
        } else {
            val bundle = Bundle();
            bundle.putString("address", address)
            bundle.putString("amount", amount)
            (activity as MainActivity).createConfirmExcFragment(bundle);
        }
    }

    override fun onClick(p0: View?) {
        onBtnSend();
    }


}
