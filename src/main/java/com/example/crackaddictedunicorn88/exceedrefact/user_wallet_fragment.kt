package com.example.crackaddictedunicorn88.exceedrefact


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.support.v4.app.FragmentManager
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.send_exc_layout.*;
import android.content.Intent
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.ViewManager
import kotlinx.android.synthetic.main.activity_main.*



// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class user_wallet_fragment : Fragment() {




    fun createSendExcFragment()

    {
        val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
        val fragment = sendExcFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.user_wallet_fragment, container, false)

    }

}
