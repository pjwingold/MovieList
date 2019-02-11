package au.com.pjwin.movielist.viewmodel

import au.com.pjwin.commonlib.util.JsonUtils
import au.com.pjwin.commonlib.viewmodel.DataViewModel
import au.com.pjwin.movielist.model.DataResponse
import kotlinx.coroutines.async

class MovieViewModel : DataViewModel<DataResponse>() {

    fun getMovies() {
        launchJob {
            val response = executeAwait({ loadMovies() },
                { onError(it) })

            if (viewModelJob.isActive) {
                onData(response)
            }
        }
    }

    private suspend fun loadMovies() = async {
        JsonUtils.loadJsonFromAsset("data.json", DataResponse::class.java)
    }.await()
}