package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentFranceBinding
import com.example.finalproject.databinding.FragmentJapanBinding


class JapanFragment : Fragment() {
    private var _binding: FragmentJapanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentJapanBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.japanBackButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_japanFragment_to_placeFragment)
        }
        return rootView
    }


}