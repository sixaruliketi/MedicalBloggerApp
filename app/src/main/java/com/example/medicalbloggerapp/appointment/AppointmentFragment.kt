package com.example.medicalbloggerapp.appointment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.SampleData
import com.example.medicalbloggerapp.databinding.FragmentAppointmentBinding
import com.example.medicalbloggerapp.databinding.FragmentHomeBinding
import com.example.medicalbloggerapp.home.homeAdapters.HomeMainAdapter

class AppointmentFragment : Fragment() {

    private var _binding: FragmentAppointmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAppointmentBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.apply {
            addAppointmentClickButton.setOnClickListener{
                Toast.makeText(context, "you're in the queue", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}