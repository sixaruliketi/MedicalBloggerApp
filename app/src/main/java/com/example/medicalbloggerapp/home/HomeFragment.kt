package com.example.medicalbloggerapp.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.medicalbloggerapp.databinding.FragmentHomeBinding
import com.example.medicalbloggerapp.home.homeAdapters.HomeMainAdapter
import com.example.medicalbloggerapp.home.models.PostCollectionModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val articlesData = mutableListOf<PostCollectionModel>()

    private val db = FirebaseDatabase.getInstance().getReference("Articles")

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
        db.child("Articles").addValueEventListener(object :ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {
                val post : PostCollectionModel = snapshot.getValue(PostCollectionModel::class.java) ?: return
                TODO()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "cancelled", Toast.LENGTH_SHORT).show()
            }

        })

        binding.apply {
            rvMain.adapter= HomeMainAdapter(articlesData)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}