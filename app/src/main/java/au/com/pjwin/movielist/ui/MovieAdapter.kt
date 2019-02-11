package au.com.pjwin.movielist.ui

import android.content.Context
import au.com.pjwin.commonlib.ui.adapter.ListClickListener
import au.com.pjwin.commonlib.ui.adapter.RecyclerListAdapter
import au.com.pjwin.commonlib.ui.adapter.RecyclerViewHolder
import au.com.pjwin.movielist.R
import au.com.pjwin.movielist.databinding.MovieViewBinding
import au.com.pjwin.movielist.model.Movie

class MovieAdapter(context: Context, movieList: List<Movie>, onListClickListener: ListClickListener<Movie>) :
    RecyclerListAdapter<Movie, MovieViewBinding, RecyclerViewHolder>(context, movieList, onListClickListener) {

    override fun layoutId() = R.layout.movie_view

    override fun bindData(binding: MovieViewBinding, data: Movie) {
        binding.movie = data
    }
}