package com.example.medicalbloggerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.data.MovieModel
import com.example.medicalbloggerapp.databinding.MovieItemBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MovieAdapter (private val movieModel: List<MovieModel>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = MovieItemBinding.bind(itemView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.binding.apply {
            imgMoviePoster.load(movieModel[position].imageUrl)
        }
    }

    override fun getItemCount() =movieModel.size


    inner class MovieViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = MovieItemBinding.bind(itemView)

    }
}