package com.example.demo.controller;

import com.example.demo.model.Genres;
import com.example.demo.model.Movie;
import com.example.demo.security.AuthenticationRequest;
import com.example.demo.security.AuthenticationResponse;
import com.example.demo.security.MovieUserDetails;
import com.example.demo.security.MovieUserDetailsService;
import com.example.demo.service.MovieService;
import com.example.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private MovieService movieService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MovieUserDetailsService movieUserDetailsService;
    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/")
    public String getIndex(Model model) throws IOException {
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
    public ResponseEntity<Genres> getGenres() throws IOException {
        return new ResponseEntity<>(movieService.callGenres(), HttpStatus.OK);
    }

    @GetMapping("/discover")
    public String getDiscover(Model model) {
        List<Movie> movies = movieService.getDiscoveredMovies();
        model.addAttribute("movies", movies);
        return "discover";
    }

    @PostMapping("/discover-year")
    public String postDiscover(Integer year) {
        movieService.callDiscover(year);
        return "redirect:/discover";
    }

    @ResponseBody
    @GetMapping("/queriedmovies")
    public List<Movie> getQueriedMovies() throws IOException {
        return movieService.getQueriedMovies();
    }

    @ResponseBody
    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username and/or password", e);
        }
final UserDetails userDetails = movieUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
    return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
