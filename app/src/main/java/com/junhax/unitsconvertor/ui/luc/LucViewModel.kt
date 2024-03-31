package com.junhax.unitsconvertor.ui.luc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LucViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
//        value = "This is luc Fragment"
    }
    val text: LiveData<String> = _text
}