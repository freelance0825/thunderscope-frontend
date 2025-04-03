package com.example.thunderscope_frontend.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.thunderscope_frontend.R
import com.example.thunderscope_frontend.ui.createnewtest.CreateNewTestActivity
import com.example.thunderscope_frontend.ui.createnewtest.CreateNewTestViewModel
import com.example.thunderscope_frontend.ui.createnewtest.CreatePatientInfoActivity

class CreateNewTestActivityFragment : Fragment() {

    private lateinit var connectButton: Button

    private var viewModel: CreateNewTestViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.create_new_test_activity_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (requireActivity() as CreateNewTestActivity).viewModel

        // Initialize UI components
        connectButton = view.findViewById(R.id.btnConnect)

        // Connect button click listener
        connectButton.setOnClickListener {
            viewModel?.isStateChanged?.value = true
        }
    }
}
