package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentCaliforniaBinding
import com.example.finalproject.databinding.FragmentFranceBinding


class FranceFragment : Fragment() {
    private var _binding: FragmentFranceBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFranceBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.franceBackButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_franceFragment_to_placeFragment)
        }
        return rootView
    }


}