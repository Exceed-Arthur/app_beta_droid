package com.example.crackaddictedunicorn88.exceedrefact


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.example.crackaddictedunicorn88.exceedrefact.utils.SharedPreferences
import kotlinx.android.synthetic.main.pref_notification.*
import kotlinx.android.synthetic.main.pref_notification.view.*


class prefNotificationFragment : Fragment(), CompoundButton.OnCheckedChangeListener {


    var isVibrationOn = false
    var time = 1 // 1 for 30 minute, 2 for 1 hour and 3 for 1 day
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.pref_notification, container, false)
        view.Silent.setOnCheckedChangeListener(this)
        view.pref_title_vibrate.setOnCheckedChangeListener(this)
        view.minutes30.setOnCheckedChangeListener(this)
        view.hourbutton.setOnCheckedChangeListener(this)
        view.daybutton.setOnCheckedChangeListener(this)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        isVibrationOn = prefs.getBoolean(SharedPreferences.isVibrationOn, false);
        time = prefs.getInt(SharedPreferences.time, 1);

        when (time) {
            1 -> minutes30.isChecked = true
            2 -> hourbutton.isChecked = true
            3 -> daybutton.isChecked = true
        }
        Silent.isChecked = isVibrationOn
        pref_title_vibrate.isChecked = !isVibrationOn

    }


    override fun onCheckedChanged(btn: CompoundButton?, isTrue: Boolean) {
        val prefs = context!!.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)

        if (isTrue) {
            when (btn?.id) {
                R.id.Silent -> {
                    isVibrationOn = true
                    pref_title_vibrate.isChecked = false
                    prefs.edit().putBoolean(SharedPreferences.isVibrationOn, true).apply()


                }
                R.id.pref_title_vibrate -> {
                    isVibrationOn = false
                    Silent.isChecked = false
                    prefs.edit().putBoolean(SharedPreferences.isVibrationOn, false).apply()
                }

                R.id.minutes30 -> {
                    time = 1
                    hourbutton.isChecked = false
                    daybutton.isChecked = false
                    prefs.edit().putInt(SharedPreferences.time, 1).apply()
                }
                R.id.hourbutton -> {
                    time = 1
                    minutes30.isChecked = false
                    daybutton.isChecked = false
                    prefs.edit().putInt(SharedPreferences.time, 2).apply()
                }
                R.id.daybutton -> {
                    time = 1
                    minutes30.isChecked = false
                    hourbutton.isChecked = false
                    prefs.edit().putInt(SharedPreferences.time, 3).apply()
                }
            }
        }
    }


}
