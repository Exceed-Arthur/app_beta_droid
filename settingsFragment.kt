package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.settings_fragment.view.*

class settingsFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.settings_fragment, container, false)

        val genPrefStartButton: Button? = view.findViewById(R.id.general_pref_page_butt) as Button
        genPrefStartButton?.setOnClickListener(this)
        val recoverybackup_btn0: Button? = view.findViewById(R.id.recovery_backup_page_button) as Button
        recoverybackup_btn0?.setOnClickListener(this)
        val prefNotification_btn0: Button? = view.findViewById(R.id.notif_page_button) as Button
        prefNotification_btn0?.setOnClickListener(this)

        val transaction_history_button:Button? = view.findViewById(R.id.transaction_history_button) as Button
        transaction_history_button?.setOnClickListener(this)
        val help_button:Button? = view.findViewById(R.id.help_button) as Button
        help_button?.setOnClickListener(this)

        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.general_pref_page_butt -> {

                (activity as MainActivity).creategenPrefFragment0()
            }
            R.id.recovery_backup_page_button -> {

                (activity as MainActivity).createrecovery_backup_1_fragment()
            }
            R.id.notif_page_button -> {

                (activity as MainActivity).createprefNotificationFragment()
            }
            R.id.transaction_history_button -> {

                (activity as MainActivity).createTxnHistoryFragment()
            }
            R.id.help_button -> {
                // createSendEthFragment()
                (activity as MainActivity).createHelpFragment()
            }
        }
    }
}
