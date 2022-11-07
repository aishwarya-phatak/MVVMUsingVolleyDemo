package com.example.mvvmusingvolleydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmusingvolleydemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        VolleySingleton.initRequestQueue(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreateUser.setOnClickListener { addUser() }
        binding.btnStringRequest.setOnClickListener { stringRequestFun() }
        binding.btnJSONObjectRequest.setOnClickListener { jsonObjectRequestFun()  }
    }

    private fun addUser(){
        
    }

    private fun stringRequestFun(){

    }

    private fun jsonObjectRequestFun(){

    }
}