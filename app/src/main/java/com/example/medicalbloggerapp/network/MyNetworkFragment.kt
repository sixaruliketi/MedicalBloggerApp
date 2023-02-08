package com.example.medicalbloggerapp.network

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.medicalbloggerapp.FakeData
import com.example.medicalbloggerapp.Images
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.SampleData
import com.example.medicalbloggerapp.databinding.FragmentMyNetworkBinding
import com.example.medicalbloggerapp.network.adapter.QuestionsRecyclerViewAdapter
import com.example.medicalbloggerapp.network.models.CategoryModel

class MyNetworkFragment : Fragment(R.layout.fragment_my_network) {

    private var _binding: FragmentMyNetworkBinding? = null
    private val binding get() = _binding!!

    lateinit var myQuestions : ArrayList<CategoryModel>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyNetworkBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.questionsCollectionRecyclerView.apply {
            layoutManager = GridLayoutManager(context,2)
            myQuestions = arrayListOf<CategoryModel>()
            addData()
            adapter = QuestionsRecyclerViewAdapter(myQuestions)
        }
    }

    private fun addData(){
        for (i in 0..9){
            myQuestions.add(CategoryModel("category$i"),)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
