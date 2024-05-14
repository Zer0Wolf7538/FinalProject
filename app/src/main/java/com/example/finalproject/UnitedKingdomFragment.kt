package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentNewyorkinfoBinding
import com.example.finalproject.databinding.FragmentUnitedKingdomBinding


class UnitedKingdomFragment : Fragment() {

    private var _binding: FragmentUnitedKingdomBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUnitedKingdomBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.unBackButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_unitedKingdomFragment_to_placeFragment)
        }
        return rootView
    }


}