package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.finalproject.databinding.FragmentAboutBinding
import com.example.finalproject.databinding.FragmentCaliforniaBinding


class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.aboutBackButton.setOnClickListener { findNavController().navigate(R.id.action_aboutFragment_to_placeFragment) }

        return rootView
    }


}