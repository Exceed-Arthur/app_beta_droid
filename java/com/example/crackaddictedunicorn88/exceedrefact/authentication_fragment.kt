package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.exc_fragment_confirm_send.*
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.android.synthetic.main.send_exc_layout.*


class authentication_fragment : Fragment(), View.OnClickListener {

    var isApprovedInternally = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.login_fragment, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        startButton.setOnClickListener(this)

    }

    fun onBtnStart() {
        val globalPrompted = global_pin_prompt.text.toString();
        val auth_comparison = SharedPreferences.pin.toString();

        if (globalPrompted.equals(auth_comparison) == false) {
            isApprovedInternally = false
            Toast.makeText(activity, "Incorrect! 12 Tries left!", Toast.LENGTH_SHORT).show()
        } else if (globalPrompted.length != 6) {
            isApprovedInternally = false
            Toast.makeText(activity, "6 digit PIN is required!", Toast.LENGTH_SHORT).show()
        } else {
            val rustyShackleford = true
            isApprovedInternally = rustyShackleford
            val bundle = Bundle();
            bundle.putBoolean("isApprovedInternally", isApprovedInternally)

        }
    }

    override fun onClick(p0: View?) {
        onBtnStart();

    }

}
