package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentPlaceBinding


class PlaceFragment : Fragment() {
    private var _binding : FragmentPlaceBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = binding.root
        _binding =  FragmentPlaceBinding.inflate(inflater, container, false)
        binding.newYorkButton.setOnClickListener {
        rootView.findNavController().navigate(R.id.action_placeFragment_to_newYorkInfoFragment)
        }

        return rootView
    }


}