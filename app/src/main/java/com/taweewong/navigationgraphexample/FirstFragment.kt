package com.taweewong.navigationgraphexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentFirstButton.setOnClickListener { buttonView ->
            navigateByDirection(buttonView)
        }
    }

    private fun navigateByActionId(view: View) {
        view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
    }

    private fun navigateByDirection(view: View) {
        val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(
            message = "Kapow moo sub",
            number = 45
        )
        view.findNavController().navigate(direction)
    }
}
