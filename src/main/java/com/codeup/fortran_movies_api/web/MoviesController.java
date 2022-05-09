package com.codeup.fortran_movies_api.web;

import com.codeup.fortran_movies_api.data.Movie;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    @GetMapping
    public Movie one() {
        return new Movie(1, "The Big Lebowski", "1995", "The Cohen Brothers", "Jeff Bridges, John Goodman, Steve Buscemi", "idk bro", "comedy, drama", "the dude just wanted to relax and go bowling.");
    }
}
