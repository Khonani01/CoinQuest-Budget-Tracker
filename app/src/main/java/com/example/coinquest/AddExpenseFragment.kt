package com.example.coinquest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class AddExpenseFragment : Fragment(R.layout.fragment_add_expense) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val saveBtn = view.findViewById<Button>(R.id.btnSaveExpenses)

        saveBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Expense Saved", Toast.LENGTH_SHORT).show()

            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }
}