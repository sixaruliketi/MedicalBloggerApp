package com.example.medicalbloggerapp.network.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.databinding.PostItemBinding
import com.example.medicalbloggerapp.home.models.PostModel

class QuestionsRecyclerViewAdapter (private val postModel: List<PostModel>) : RecyclerView.Adapter<QuestionsRecyclerViewAdapter.QuestionsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item_2,parent,false)
        return QuestionsViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionsViewHolder, position: Int) {
        holder.binding.apply {
            imgMoviePoster.load(postModel[position].imageUrl)
        }
    }

    override fun getItemCount() = postModel.size


    inner class QuestionsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = PostItemBinding.bind(itemView)

    }
}