package com.onc.mvvmandroidexample.viewmodel
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onc.mvvmandroidexample.model.entities.User
import com.onc.mvvmandroidexample.model.repository.UserRepository

class ListViewModel : ViewModel() {
    val list = MutableLiveData<ArrayList<User>>()
    val loader = MutableLiveData<Boolean>()


    init {
        getUserList()
    }

    fun getUserList(){
        loader.postValue(true)
        Handler(Looper.getMainLooper()).postDelayed({
            val users = UserRepository.getFakeUsers()
            list.postValue(users)
            loader.postValue(false)

        }, 3000)

 /*       val users = UserRepository.getFakeUsers()
        list.postValue(users)
*/
    }
}