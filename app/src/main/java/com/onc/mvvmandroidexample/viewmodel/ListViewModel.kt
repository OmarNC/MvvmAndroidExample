package com.onc.mvvmandroidexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onc.mvvmandroidexample.model.entities.User
import com.onc.mvvmandroidexample.model.entities.UserRepository

class ListViewModel : ViewModel() {
    val list = MutableLiveData<ArrayList<User>>()

    fun getUserList(){
        val users = UserRepository.getFakeUsers()
        list.postValue(users)
    }
}