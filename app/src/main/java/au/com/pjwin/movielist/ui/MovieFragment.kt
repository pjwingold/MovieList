package au.com.pjwin.movielist.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import au.com.pjwin.commonlib.ui.BaseFragment
import au.com.pjwin.commonlib.ui.adapter.ListClickListener
import au.com.pjwin.movielist.R
import au.com.pjwin.movielist.databinding.FragmentMainBinding
import au.com.pjwin.movielist.model.DataResponse
import au.com.pjwin.movielist.model.Movie
import au.com.pjwin.movielist.viewmodel.MovieViewModel

class MovieFragment : BaseFragment<DataResponse, MovieViewModel, FragmentMainBinding>() {

    private lateinit var movieAdapter: MovieAdapter
    private lateinit var movieList: List<Movie>
    var selectedMovie: Movie? = null

    override fun layoutId() = R.layout.fragment_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieList = listOf()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getMovies()
        binding.movieCarousel.apply {
            //val carouselLayoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL)
            //carouselLayoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())
            layoutManager = //carouselLayoutManager
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            //addOnScrollListener(CenterScrollListener())
            movieAdapter = MovieAdapter(context, movieList, object :
                ListClickListener<Movie> {
                override fun onClick(data: Movie) {
                    selectedMovie = data
                    onPrimaryAction()
                }
            })

            adapter = movieAdapter
        }
    }

    override fun onData(data: DataResponse?) {
        data?.let {
            movieAdapter.list = it.data.movies
        }
    }
}