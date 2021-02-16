package com.example.demo.api;

import com.example.demo.model.Discover;
import com.example.demo.model.Genres;
import com.example.demo.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieApi {

    @GET("genre/movie/list")
    Call<Genres> listGenres (@Query("api_key") String apiKey);

    @GET("discover/movie")
    Call<Discover> discover (@Query("api_key") String apiKey, @Query("year") Integer year);

    @GET("movie/{movie_id}")
    Call<Movie> callMovie (@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);



}
