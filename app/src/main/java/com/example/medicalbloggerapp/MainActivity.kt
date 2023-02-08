package com.example.medicalbloggerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.medicalbloggerapp.adapters.MainAdapter
import com.example.medicalbloggerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter= MainAdapter(SampleData.collections)
        }

    }
}