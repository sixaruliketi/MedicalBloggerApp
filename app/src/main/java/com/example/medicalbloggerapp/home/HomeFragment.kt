package com.example.medicalbloggerapp.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medicalbloggerapp.SampleData
import com.example.medicalbloggerapp.databinding.FragmentHomeBinding
import com.example.medicalbloggerapp.home.homeAdapters.HomeMainAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.apply {
            rvMain.adapter= HomeMainAdapter(SampleData.collections)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}