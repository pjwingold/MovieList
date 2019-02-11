package au.com.pjwin.movielist.viewmodel

import au.com.pjwin.movielist.BaseTest
import io.mockk.every
import io.mockk.just
import io.mockk.runs
import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MovieViewModelTest : BaseTest() {

    private var viewModel = spyk<MovieViewModel>()

    @Before
    fun init() {
        every { viewModel.onData(any()) } just runs
    }

    @Test
    fun getMovies() {
        viewModel.getMovies()

        verify(atMost = 1) { viewModel.onData(any()) }
    }
}