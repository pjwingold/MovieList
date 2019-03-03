package au.com.pjwin.movielist.ui

import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import au.com.pjwin.commonlib.ui.adapter.ListClickListener
import au.com.pjwin.commonlib.ui.adapter.RecyclerListAdapter
import au.com.pjwin.commonlib.ui.adapter.RecyclerViewHolder
import au.com.pjwin.movielist.R
import au.com.pjwin.movielist.databinding.MovieViewBinding
import au.com.pjwin.movielist.model.Movie

class MovieAdapter(
    context: Context,
    movieList: List<Movie>,
    onListClickListener: ListClickListener<Movie>
) :
    RecyclerListAdapter<Movie, MovieViewBinding, RecyclerViewHolder>(
        context,
        movieList,
        onListClickListener
    ) {

    override fun layoutId() = R.layout.movie_view

    override fun bindData(binding: MovieViewBinding, data: Movie) {
        binding.movie = data
        /*binding.root.apply {
            setOnFocusChangeListener { v, hasFocus ->
                val anim: Animation
                if (hasFocus) {
                    anim = AnimationUtils.loadAnimation(v.context, R.anim.scale_in)
                    startAnimation(anim)

                } else {
                    anim = AnimationUtils.loadAnimation(v.context, R.anim.scale_out)
                    startAnimation(anim)

                }
                anim.fillAfter = true
            }
        }*/
    }
}