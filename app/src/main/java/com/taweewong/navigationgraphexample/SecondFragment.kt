package com.taweewong.navigationgraphexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentSecondButton.setOnClickListener { buttonView ->
            buttonView
                .findNavController()
                .navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        retrieveArguments()
    }

    private fun retrieveArguments() {
        arguments?.let { arguments ->
            val args = SecondFragmentArgs.fromBundle(arguments)
            val message = args.message
            val number = args.number
            Toast.makeText(activity, "$message, $number", Toast.LENGTH_SHORT).show()
        }
    }
}
