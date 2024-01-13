package com.example.lesson2810

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel: ViewModel() {

    private val _dataResponse = MutableLiveData<List<String>>()
    val dataResponse: LiveData<List<String>>
        get() = _dataResponse

    fun makeDataRequest(count: Int) {
        val result = (0..count).map {
            "String number $it"
        }
        _dataResponse.postValue(result)
    }
}