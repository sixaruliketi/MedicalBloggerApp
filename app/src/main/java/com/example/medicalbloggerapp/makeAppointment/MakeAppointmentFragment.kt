package com.example.medicalbloggerapp.makeAppointment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.Toast
import com.example.medicalbloggerapp.Patient
import com.example.medicalbloggerapp.databinding.FragmentMakeAppointmentBinding
import com.google.firebase.database.FirebaseDatabase

class MakeAppointmentFragment : Fragment() {

    private var _binding: FragmentMakeAppointmentBinding? = null
    private val binding get() = _binding!!

    private val db = FirebaseDatabase.getInstance().getReference("Appointments")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMakeAppointmentBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.apply {

            var patientDate = ""
            makeAppointmentButton.setOnClickListener {

                val date = makeAppointmentCalendar.weekDayTextAppearance
                // TODO: date

                val email = personEmailEditText.text.toString()
                val name = personNameEditText.text.toString()
                val number = personContactNumberEditText.text.toString()

                val patientInfo = Patient(patientDate, name, number, email)

                db.child(name).setValue(patientInfo)

                Toast.makeText(context, "your appointment in set", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}