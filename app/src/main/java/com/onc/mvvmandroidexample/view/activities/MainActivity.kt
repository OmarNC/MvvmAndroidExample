package com.onc.mvvmandroidexample.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onc.mvvmandroidexample.R
import com.onc.mvvmandroidexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTitle.text = "Test 1"
        binding.tvTitle2.text = "Test 2"

    }

    override fun onPause() {
        super.onPause()
        binding.tvTitle
    }

    override fun onResume() {
        super.onResume()
        binding.tvTitle
    }
}