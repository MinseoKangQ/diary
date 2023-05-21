package com.project.diary

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    private val idLiveData : MutableLiveData<String> = MutableLiveData();

    init { idLiveData.value = "" }
}