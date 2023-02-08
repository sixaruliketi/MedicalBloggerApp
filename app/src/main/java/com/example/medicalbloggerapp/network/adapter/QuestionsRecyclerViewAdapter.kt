package com.example.medicalbloggerapp.network.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.databinding.QuestionCategoryItemBinding
import com.example.medicalbloggerapp.network.models.CategoryModel

class QuestionsRecyclerViewAdapter (private val categoryModel: ArrayList<CategoryModel>) : RecyclerView.Adapter<QuestionsRecyclerViewAdapter.QuestionsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.question_category_item,parent,false)
        return QuestionsViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionsViewHolder, position: Int) {
        holder.binding.apply {
            categoryTextView.text = categoryModel[position].title
        }
    }

    override fun getItemCount() = categoryModel.size


    inner class QuestionsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = QuestionCategoryItemBinding.bind(itemView)

    }
}