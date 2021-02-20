package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.api.MovieApi;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.persistence.Column;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter

@Service
public class MovieService {
    private MovieRepository movieRepository;
    private UserRepository userRepository;
    private MovieApi movieApi = MovieServiceGenerator.createService(MovieApi.class);
    private String movieApiKey = System.getenv("API_KEY");
    private List<Movie> discoveredMovies;

    @Autowired
    public MovieService(MovieRepository movieRepository, UserRepository userRepository) {
        this.movieRepository = movieRepository;
        this.userRepository = userRepository;
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
    public void   callDiscover(Integer year) {
        final Call<Discover> call = movieApi.discover(movieApiKey, year, "vote_average.desc", 50);
//        try {
//           Discover discover = call.execute().body();
//            assert discover != null;
//            discoveredMovies = discover.getResults();
//            movieRepository.saveAll(discoveredMovies);
//        }
//        catch (IOException e) {
//            System.out.println("fuck");
//        }

        call.enqueue(new Callback<Discover>() {
            @Override
            public void onResponse(Call<Discover> call, Response<Discover> response) {

                if (response.isSuccessful()) {
                    System.out.println(response.headers());
                    System.out.println(response.code());
                    System.out.println(response.body());
                    System.out.println(response.isSuccessful());
                    //System.out.println(response.body().getResults().get(1).getTitle());
                    //Discover discover = response.body();
                    //System.out.println(discover.getResults().get(1).getTitle());
                    //assert discover != null;
                    //discoveredMovies = discover.getResults();
                    assert response.body() != null;
                    discoveredMovies = (response.body().getResults());
                    System.out.println(discoveredMovies.get(1).getTitle());

                } else {
                    System.out.println("Not successful");
                }
            }

            @Override
            public void onFailure(Call<Discover> call, Throwable t) {
                System.out.println(t);
            }
        });


        while(!call.isExecuted()){
        }
        System.out.println(discoveredMovies.get(1).getTitle());
    }

    public List<Movie> getQueriedMovies () {
        return (List<Movie>) movieRepository.findAll();
    }

    public Boolean addUser (String user, String password) {
       if (userRepository.findByUserName(user).isPresent()) {
           return false;
       }
       userRepository.save(new User(1L,true,new BCryptPasswordEncoder().encode(password),"ROLE_USER",user));
       return true;
    }
}
