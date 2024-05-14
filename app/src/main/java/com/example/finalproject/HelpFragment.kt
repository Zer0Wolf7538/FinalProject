package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentHelpBinding


class HelpFragment : Fragment() {
    private var _binding: FragmentHelpBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHelpBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.emailButton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("tripadvisor@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "")
                putExtra(Intent.EXTRA_TEXT, "")
                putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"))

            })
        }
        binding.callButton.setOnClickListener {
            val callIntent: Intent = Uri.parse("tel:17818005000").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }

        binding.findButton.setOnClickListener {
            val mapIntent: Intent = Uri.parse("geo: 0,0?q=400+1st+Avenue,+Needham,+MA")
                .let { location -> Intent(Intent.ACTION_VIEW, location) }
            startActivity(mapIntent)
        }
        binding.backButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_helpFragment_to_placeFragment)
        }


        return rootView
    }


}