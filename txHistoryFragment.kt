package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.settings_fragment.view.*

class txHistoryFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.transaction_history, container, false)

        val bitcoinLogoTxn:Button? = view.findViewById(R.id.btc_button_22) as Button
        bitcoinLogoTxn?.setOnClickListener(this)
        val ethLogoTxn:Button? = view.findViewById(R.id.eth_button_2) as Button
        ethLogoTxn?.setOnClickListener(this)
        val excLogoTxn:Button? = view.findViewById(R.id.exc_button_2) as Button
        excLogoTxn?.setOnClickListener(this)
        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btc_button_22 -> {
                // Open URL: btc.blockexplorer
                (activity as MainActivity).openBtcBlockExplorer()
            }
            R.id.eth_button_2 -> {
                // Open URL: etherscan.io/
                (activity as MainActivity).openEthereumBlockExplorer()
            }
            R.id.exc_button_2 -> {
                //Open URL: etherscan.io/exceed
                (activity as MainActivity).openExceedBlockExplorer()
            }
        }
    }
}
