package com.example.medicalbloggerapp.home.homeAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.databinding.PostItemBinding
import com.example.medicalbloggerapp.home.models.PostModel

class PostsAdapter (private val postModel: List<PostModel>) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
        return PostsViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.binding.apply {
            imgMoviePoster.load(postModel[position].imageUrl)
        }
    }

    override fun getItemCount() = postModel.size


    inner class PostsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = PostItemBinding.bind(itemView)

    }
}