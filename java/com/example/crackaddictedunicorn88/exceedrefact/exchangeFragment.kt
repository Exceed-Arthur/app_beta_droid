package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class exchangeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_exchange_fragment, container, false)

        val fork_usdt_button: Button? = view.findViewById(R.id.button_exc_usdt_fork) as Button
        val fork_eth_button: Button? = view.findViewById(R.id.button_exc_btc) as Button
        val fork_btc_button: Button? = view.findViewById(R.id.button_exc_eth_fork) as Button
        val tj_usdt_button: Button? = view.findViewById(R.id.exc_tokenjar) as Button
        val tj_eth_button: Button? = view.findViewById(R.id.exc_btc_tokenjar) as Button
        val tj_btc_button: Button? = view.findViewById(R.id.exc_eth_tokenjar) as Button
        val ox_usdt_button: Button? = view.findViewById(R.id.exc_usdt_0x) as Button
        val ox_eth_button: Button? = view.findViewById(R.id.exc_btc_tokenjar) as Button
        val ox_btc_button: Button? = view.findViewById(R.id.exc_eth_0x) as Button

        fork_usdt_button?.setOnClickListener(this)
        fork_eth_button?.setOnClickListener(this)
        fork_btc_button?.setOnClickListener(this)

        tj_usdt_button?.setOnClickListener(this)
        tj_eth_button?.setOnClickListener(this)
        tj_btc_button?.setOnClickListener(this)

        ox_usdt_button?.setOnClickListener(this)
        ox_eth_button?.setOnClickListener(this)
        ox_btc_button?.setOnClickListener(this)

        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_exc_usdt_fork -> {
                // Open URL: forkdelta.app/exc-usdt
                (activity as MainActivity).openForkUSDT()
            }
            R.id.button_exc_btc -> {
                //Open URL: forkdelta.app/exc-eth
                (activity as MainActivity).openForkETH()
            }
            R.id.button_exc_eth_fork -> {
                // Open URL: forkdelta.app/exc-btc
                (activity as MainActivity).openForkBTC()
            }
            R.id.exc_tokenjar -> {
                // Open URL: tokenjar.io/usdt-exc
                (activity as MainActivity).openTJUSDT()
            }
            R.id.exc_btc_tokenjar -> {
                //Open URL: tokenjar.io/exc-eth
                (activity as MainActivity).openTJETH()
            }
            R.id.exc_eth_tokenjar -> {
                // Open URL: tokenjar.io/exc-btc
                (activity as MainActivity).openTJBTC()
            }
            R.id.exc_usdt_0x -> {
                // Open URL: 0x.io/exc-usdt
                (activity as MainActivity).open0XUSDT()
            }
            R.id.exc_btc_0x -> {
                //Open URL: 0x.io/exc-eth
                (activity as MainActivity).open0XETH()
            }
            R.id.exc_eth_0x -> {
                // Open URL: 0x.io/exc-btc
                (activity as MainActivity).open0xBTC()
            }
        }
    }
}