package au.com.pjwin.movielist.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import au.com.pjwin.commonlib.ui.Arg
import au.com.pjwin.commonlib.ui.BaseFragment
import au.com.pjwin.commonlib.viewmodel.VoidViewModel
import au.com.pjwin.movielist.R
import au.com.pjwin.movielist.databinding.MovieDetailBinding
import au.com.pjwin.movielist.model.Movie

class MovieDetailFragment : BaseFragment<Void, VoidViewModel, MovieDetailBinding>() {

    val TAG = MovieDetailFragment::class.simpleName

    companion object {
        @JvmStatic
        fun newInstance(movie: Movie): MovieDetailFragment {
            return MovieDetailFragment().setArguments(movie)
        }
    }

    override fun layoutId() = R.layout.movie_detail

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val movie = getArgument<Movie>(Arg.FIRST)

        movie?.let {
            binding.movie = it
            binding.casts = NameListAdapter(context!!, it.actors)
            binding.writers = NameListAdapter(context!!, it.writers)
            //we are missing producers from the json
            binding.producers = NameListAdapter(context!!, listOf())

            var stars = 0
            try {
                stars = it.stars.toInt()
            } catch (e: NumberFormatException) {
                Log.e(TAG, "Invalid number ${it.stars}", e)
            }
            binding.movieStars = stars
        }
    }
}