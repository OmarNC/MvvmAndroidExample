package com.onc.mvvmandroidexample.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.onc.mvvmandroidexample.R
import com.onc.mvvmandroidexample.databinding.ActivityMainBinding
import com.onc.mvvmandroidexample.databinding.ActivityNavBinding

class NavActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavBinding
    private lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.container)
        setupActionBarWithNavController(navController,null)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }
}