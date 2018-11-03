package com.example.crackaddictedunicorn88.exceedrefact


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.general_pref.*
import kotlinx.android.synthetic.main.general_pref.view.*


class genPrefFragment0 : Fragment(), CompoundButton.OnCheckedChangeListener {


    var languageUser = 1 // 1 for english, 2 for china and 3 for korea
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.general_pref, container, false)


        view.engbox.setOnCheckedChangeListener(this)
        view.chinabox.setOnCheckedChangeListener(this)
        view.koreabox.setOnCheckedChangeListener(this)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)

        languageUser = prefs.getInt(SharedPreferences.languageUser, 1);

        when (languageUser) {
            1 -> engbox.isChecked = true
            2 -> chinabox.isChecked = true
            3 -> koreabox.isChecked = true
        }

    }


    override fun onCheckedChanged(btn: CompoundButton?, isTrue: Boolean) {
        val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)

        if (isTrue) {
            when (btn?.id) {

                R.id.engbox -> {
                    languageUser = 1
                    chinabox.isChecked = false
                    chinabox.isChecked = false
                    prefs.edit().putInt(SharedPreferences.languageUser, 1).apply()
                }
                R.id.chinabox -> {
                    languageUser = 2
                    engbox.isChecked = false
                    koreabox.isChecked = false
                    prefs.edit().putInt(SharedPreferences.languageUser, 2).apply()
                }
                R.id.koreabox -> {
                    languageUser = 3
                    engbox.isChecked = false
                    chinabox.isChecked = false
                    prefs.edit().putInt(SharedPreferences.languageUser, 3).apply()
                }
            }
        }
    }


}
