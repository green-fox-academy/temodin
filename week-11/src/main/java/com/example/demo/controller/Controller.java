package com.example.demo.controller;

import com.example.demo.model.Genres;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {
    private MovieService movieService;

    @Autowired
    public Controller(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/")
    public String getIndex (Model model) throws IOException {
        Movie movie = movieService.showMovie();
        System.out.println(movie.getTitle());
//        movieService.callGenres();
//        List<Genre> genreList =  movieService.getGenreList();
//        model.addAttribute("genres",movieService.getGenreList());
//        for (Genre genre: genreList
//             ) {
//            System.out.println(genre.getName());
//        }
        return "index";
    }

    @ResponseBody
    @GetMapping("/genres")
    public ResponseEntity<Genres> getGenres () throws IOException {
        return new ResponseEntity<>(movieService.callGenres(), HttpStatus.OK);
    }
}