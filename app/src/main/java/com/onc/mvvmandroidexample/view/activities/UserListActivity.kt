package com.onc.mvvmandroidexample.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onc.mvvmandroidexample.R
import com.onc.mvvmandroidexample.databinding.ActivityUserListBinding
import com.onc.mvvmandroidexample.view.fragments.ListFragment

class UserListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ListFragment())
            .commit()

    }
}