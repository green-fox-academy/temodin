package com.example.demo.service;

import com.example.demo.model.Discover;
import com.example.demo.model.Genres;
import com.example.demo.api.MovieApi;
import com.example.demo.model.Movie;
import com.example.demo.model.MovieServiceGenerator;
import com.example.demo.repository.MovieRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter

@Service
public class MovieService {
    private MovieRepository movieRepository;
    private MovieApi movieApi = MovieServiceGenerator.createService(MovieApi.class);
    private String movieApiKey = System.getenv("API_KEY");
    private List<Movie> discoveredMovies = new ArrayList<>();

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    //get a single movie
    public Movie showMovie() throws IOException {
        Call<Movie> call = movieApi.callMovie(3, movieApiKey);
        return call.execute().body();
    }

    //get genres list
    public Genres callGenres() throws IOException {
        Call<Genres> call = movieApi.listGenres(movieApiKey);

        Response<Genres> response = call.execute();
        return response.body();
    }

    //get movie list from a specific year
    public void callDiscover(Integer year) {
        Call<Discover> call = movieApi.discover(movieApiKey, year, "vote_average.desc", 50);
        try {
           Discover discover = call.execute().body();
            assert discover != null;
            discoveredMovies = discover.getResults();
            movieRepository.saveAll(discoveredMovies);
        }
        catch (IOException e) {
            System.out.println("fuck");
        }

//        call.enqueue(new Callback<Discover>() {
//            @Override
//            public void onResponse(Call<Discover> call, Response<Discover> response) {
//                if (response.isSuccessful()) {
//                    Discover discover = response.body();
//                    assert discover != null;
//                    discoveredMovies = discover.getResults();
//                } else {
//                    System.out.println("Not successful");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Discover> call, Throwable t) {
//                System.out.println(t);
//            }
//        })
        ;
    }
}
