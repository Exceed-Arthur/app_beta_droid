package com.example.crackaddictedunicorn88.exceedrefact

import android.support.v4.app.FragmentManager
import kotlinx.android.synthetic.main.send_exc_layout.*;
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import com.example.crackaddictedunicorn88.exceedrefact.*


class confirmSendExcFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment


        val input_exc_amount:View = amount_send_exc

        val view: View = inflater.inflate(R.layout.exc_fragment_confirm_send, container, false)
        return view
    }


}
