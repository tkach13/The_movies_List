package com.benten.themovieslist.apis

import com.benten.themovieslist.models.GetPopularsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey: String
    ): GetPopularsResponse
}