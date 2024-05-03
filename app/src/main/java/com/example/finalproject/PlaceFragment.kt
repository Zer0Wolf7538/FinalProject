package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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
        val menuHost: MenuHost = requireActivity()

        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.options_menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return NavigationUI.onNavDestinationSelected(
                    menuItem,
                    requireView().findNavController()
                )
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)

        return rootView
    }


}