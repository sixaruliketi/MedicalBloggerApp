package com.example.medicalbloggerapp.appointment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.databinding.FragmentAppointmentBinding

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
                val action = AppointmentFragmentDirections.actionAppointmentFragmentToMakeAppointmentFragment()
                view?.findNavController()?.navigate(action)
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.nav_host_fragment, fragment)
        transaction?.disallowAddToBackStack()
        transaction?.commit()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}