package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentPlaceBinding


class PlaceFragment : Fragment() {
    private var _binding: FragmentPlaceBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentPlaceBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.newYorkButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_placeFragment_to_newYorkInfoFragment)
        }
        binding.caliButton.setOnClickListener{
            rootView.findNavController().navigate(R.id.action_placeFragment_to_californiaFragment)
        }
        binding.texasButton.setOnClickListener{
            rootView.findNavController().navigate(R.id.action_placeFragment_to_texasFragment)
        }
        binding.ukButton.setOnClickListener{
            rootView.findNavController().navigate(R.id.action_placeFragment_to_unitedKingdomFragment)
        }
        binding.franceButton.setOnClickListener{
            rootView.findNavController().navigate(R.id.action_placeFragment_to_franceFragment)
        }
        binding.japanButton.setOnClickListener{
            rootView.findNavController().navigate(R.id.action_placeFragment_to_japanFragment)
        }
        return rootView
    }


}