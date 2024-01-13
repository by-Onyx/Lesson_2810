package com.example.lesson2810.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lesson2810.R
import com.example.lesson2810.StringAdapter
import com.example.lesson2810.databinding.AllSenderMsgBinding

class AllSenderMsgFragment : Fragment(R.layout.all_sender_msg) {
    private val args: AllSenderMsgFragmentArgs by navArgs()
    private val adapter = StringAdapter()
    private val binding: AllSenderMsgBinding by viewBinding()
    private val viewModel: AllSenderMsgViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        bindDataRequest()
    }

    private fun bindDataRequest() {
        viewModel.dataResponse.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.makeDataRequest(args.msges.toList())
    }

    private fun initRecycler() {
        with(binding.allMessageRecyclerView) {
            layoutManager = LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )
            this.adapter = this@AllSenderMsgFragment.adapter
        }
    }
}

class AllSenderMsgViewModel: ViewModel() {
    private val _dataResponse = MutableLiveData<List<String>>()
    val dataResponse: LiveData<List<String>>
        get() = _dataResponse

    fun makeDataRequest(list: List<String>) {
        _dataResponse.postValue(list)
    }
}
