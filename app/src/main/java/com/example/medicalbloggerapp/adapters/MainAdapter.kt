package com.example.medicalbloggerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.data.MainModel
import com.example.medicalbloggerapp.databinding.CollectionItemBinding

class MainAdapter(private val collection : List<MainModel>) : RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.collection_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreMovie.text =collection.title
            val movieAdapter = MovieAdapter(collection.movieModels)
            rvMovieChild.adapter=movieAdapter
        }
    }

    override fun getItemCount() =collection.size

    inner class CollectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = CollectionItemBinding.bind(itemView)
    }


}