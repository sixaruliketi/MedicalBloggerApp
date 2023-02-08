package com.example.medicalbloggerapp.home.homeAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.databinding.HomePostCollectionItemBinding
import com.example.medicalbloggerapp.databinding.HomePostItemBinding
import com.example.medicalbloggerapp.home.models.PostCollectionModel

class HomeMainAdapter(private val collection : List<PostCollectionModel>) : RecyclerView.Adapter<HomeMainAdapter.CollectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.home_post_collection_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreMovie.text =collection.title
            val postsAdapter = PostsAdapter(collection.postModels)
            rvMovieChild.adapter=postsAdapter
        }
    }

    override fun getItemCount() =collection.size

    inner class CollectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = HomePostCollectionItemBinding.bind(itemView)
    }


}