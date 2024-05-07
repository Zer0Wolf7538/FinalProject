package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentHelpBinding


class HelpFragment : Fragment() {
    private var _binding: FragmentHelpBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       _binding = FragmentHelpBinding.inflate(inflater, container, false)
       val rootView = binding.root

        binding.callButton.setOnClickListener{
            val callIntent: Intent = Uri.parse("tel:17818005000").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent) }
        binding.emailButton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("northamericapr@tripadvisor.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Email subject")
                putExtra(Intent.EXTRA_TEXT, "Email message text")
                putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"))

            })
        }
        binding.findButton.setOnClickListener{
            val mapIntent: Intent = Uri.parse( "geo: 0,0?q=400+1st+Avenue,+Needham,+MA" ).let { location -> Intent(Intent.ACTION_VIEW, location) }
            startActivity(mapIntent) }


        return rootView
    }


}