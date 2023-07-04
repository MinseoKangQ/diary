package com.project.diary

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    var stringLiveData : MutableLiveData<String> = MutableLiveData()

    init { stringLiveData.value = "" }

    fun addString() : String {
        stringLiveData.value = (stringLiveData?.value + "+")
        return stringLiveData.value.toString()
    }
}