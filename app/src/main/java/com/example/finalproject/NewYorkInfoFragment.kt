package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentNewyorkinfoBinding


class NewYorkInfoFragment : Fragment() {
    private var _binding: FragmentNewyorkinfoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewyorkinfoBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.nyBackButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_newYorkInfoFragment_to_placeFragment)

        }
        return rootView

    }



}