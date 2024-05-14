package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.FragmentCaliforniaBinding



class CaliforniaFragment : Fragment() {
    private var _binding: FragmentCaliforniaBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCaliforniaBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.calBackButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_californiaFragment_to_placeFragment)
        }
        return rootView
    }


}