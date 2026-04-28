package com.example.coinquest

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val addBtn = view.findViewById<View>(R.id.fabAdd)

        addBtn.setOnClickListener {
            (activity as MainActivity).loadFragment(AddExpenseFragment())
        }
    }
}