package com.example.lesson2810.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lesson2810.R
import com.example.lesson2810.StringAdapter
import com.example.lesson2810.databinding.FragmentFourthBinding

class FourthFragment: Fragment(R.layout.fragment_fourth) {
    private val binding: FragmentFourthBinding by viewBinding()
    private val adapter = StringAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
    }
}