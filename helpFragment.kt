package com.example.crackaddictedunicorn88.exceedrefact

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.settings_fragment.view.*

class helpFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.help_fragment, container, false)



        return view
    }

    companion object {
        fun newInstance(): user_wallet_fragment {
            return user_wallet_fragment()
        }
    }


}
