package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.exc_fragment_confirm_send.*
import kotlinx.android.synthetic.main.send_exc_layout.*


class splashFragment : Fragment() {

    val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.splash_one, container, false)
        return view


    }



}


