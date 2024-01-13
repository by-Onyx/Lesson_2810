package com.example.lesson2810.fragments

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lesson2810.R
import com.example.lesson2810.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    //private val binding: FragmentFirstBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*binding.buttonNavigateSecond.setOnClickListener {
            val userInput = binding.edittextUserInput.text.toString()
            val direction =
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                    dataCount = userInput.toInt()
                )
            findNavController().navigate(direction)
        }
        binding.buttonNavigateThird.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }*/
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FirstFragment()
    }
}