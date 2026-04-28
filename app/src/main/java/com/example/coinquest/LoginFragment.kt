package com.example.coinquest

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val loginBtn = view.findViewById<Button>(R.id.btnLogin)

        loginBtn.setOnClickListener {
            (activity as MainActivity).loadFragment(DashboardFragment())
        }
    }
}