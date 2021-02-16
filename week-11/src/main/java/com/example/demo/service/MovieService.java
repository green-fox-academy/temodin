package com.example.demo.service;

import com.example.demo.model.Discover;
import com.example.demo.model.Genres;
import com.example.demo.api.MovieApi;
import com.example.demo.model.Movie;
import lombok.Getter;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class MovieService {

    @Getter

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    MovieApi movieApi = retrofit.create(MovieApi.class);
    String apiKey = System.getenv("API_KEY");

    public Movie showMovie() throws IOException {
        Call<Movie> call = movieApi.callMovie(3, apiKey);
        return call.execute().body();
    }

    public Genres callGenres() throws IOException {
        Call<Genres> call = movieApi.listGenres(apiKey);

        Response<Genres> response = call.execute();
        return response.body();
//        call.enqueue(new Callback<List<Genres>>() {
//                         @Override
//                         public void onResponse(Call<List<Genres>> call, Response<List<Genres>> response) {
//                             if (response.isSuccessful()) {
//                                 genreList = response.body();
//                             } else {
//                                 System.out.println("Request unsuccessful");
//                             }
//                         }
//
//                         @Override
//                         public void onFailure(Call<List<Genres>> call, Throwable t) {
//                             System.out.println("Error");
//                         }
//
//                     }
//        );
    }
}
