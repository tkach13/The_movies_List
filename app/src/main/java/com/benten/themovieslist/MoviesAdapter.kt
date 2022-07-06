package com.benten.themovieslist

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benten.themovieslist.databinding.LayoutMovieItemBinding

class MoviesAdapter: RecyclerView.Adapter<MoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding =
            LayoutMovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(binding)
    }





    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 0
    }
}



class MoviesViewHolder(val binding: LayoutMovieItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
companion object {
    const val IMAGE_PATH = "https://image.tmdb.org/t/p/w500"
}
}
