package com.example.crackaddictedunicorn88.exceedrefact

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.general_pref.*
import kotlinx.android.synthetic.main.general_pref.view.*
import kotlinx.android.synthetic.main.login_creation_layout.*


class createPinFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.login_creation_layout, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        login_create_button.setOnClickListener(this)

    }

    fun startMainActivity(){
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
    }

    fun onBtnCreatePin() {
        val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        val pin_first = pin_enter_box_1.text.toString();
        val pin_two = pin_enter_box_2.text.toString();
        if (pin_first.length != 6) {
            Toast.makeText(activity, "6 digits are required", Toast.LENGTH_SHORT).show()
        } else if (pin_two != pin_first) {
            Toast.makeText(activity, "Confirmation failed, try again", Toast.LENGTH_SHORT).show()
        } else {
            val bundle = Bundle();
            bundle.putString("user_pin", pin_two)
            var user_pin = pin_two
            val editor = prefs.edit();
            editor.putString("user_pin", user_pin)
            editor.commit()
            editor.putBoolean("isApprovedInternally", true)
            editor.commit()
        }
    }

    override fun onClick(p0: View?) {
        onBtnCreatePin();

    }

}


