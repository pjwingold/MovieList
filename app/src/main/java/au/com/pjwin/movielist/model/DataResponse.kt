package au.com.pjwin.movielist.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataResponse(val data: MovieList)

data class MovieList(val movies: List<Movie>)

data class Movie(
    @SerializedName("Title") val title: String,
    @SerializedName("Year") val year: String,
    @SerializedName("Runtime") val runtime: String,
    @SerializedName("Genre") val genre: String,
    @SerializedName("Director") val director: String,
    @SerializedName("Writers") val writers: List<String>,
    @SerializedName("Actors") val actors: List<String>,
    @SerializedName("Plot") val plot: String,
    @SerializedName("Poster") val poster: String,
    @SerializedName("Stars") val stars: String,
    @SerializedName("Rating") val rating: String,
    @SerializedName("Votes") val votes: String,
    @SerializedName("Studio") val studio: String,
    @SerializedName("Copyright") val copyRight: String
) : Serializable
