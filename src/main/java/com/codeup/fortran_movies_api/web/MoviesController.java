package com.codeup.fortran_movies_api.web;

import com.codeup.fortran_movies_api.data.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    private List<Movie> sampleMovies = setMovies();
//    private List<Movie> getSampleMovies = setMovies();

//    @GetMapping
//    public Movie one() {
//        return new Movie(1, "The Big Lebowski", "1995", "The Cohen Brothers", "Jeff Bridges, John Goodman, Steve Buscemi", "idk bro", "comedy, drama", "the dude just wanted to relax and go bowling.");
//    }
    @GetMapping
    public Movie one() {
        return sampleMovies.get(1); // I do not understand params and how it matches with the DB **********
    };

//    @GetMapping("all") // Path becomes: /api/movies/all
//    public List<Movie> getAll() {
//        return new ArrayList<>();
//    }
    @GetMapping("all")
    public List<Movie> getAll() {
        return sampleMovies;
    };

//    @GetMapping("{id}") // Define the path variable to use here
//    public Movie getById(@PathVariable int id) { // Actually use the path variable here by annotating a parameter with @PathVariable
////        System.out.println(id);
//        return sampleMovies.stream().filter((movie) -> {
//            return movie.getId() == id;
//        })
//                .findFirst()
//                .orElse(null);
//    };

    @GetMapping("{id}") // Define the path variable to use here
    public Movie getById(@PathVariable int id) { // Actually use the path variable here by annotating a parameter with @PathVariable

        return sampleMovies.stream().filter((movie) -> {
                    return movie.getId() == id; // filter out non-matching movies
                })
                .findFirst() // isolate to first match
                .orElse(null); // prevent errors by returning null... not the greatest practice, but it'll do for now
    }

//    @PostMapping
//    public void create(@RequestBody Movie newMovie) {
//        System.out.println(newMovie);
//    }

    @PostMapping    // api/movies
    public void create(@RequestBody Movie newMovie) {
        System.out.println(newMovie);
        // add to our movies list (fake db)
        sampleMovies.add(newMovie);
    }

    @PostMapping("all") // api/movies/all(?)
    public void createAll(@RequestBody List<Movie> moviesToAdd) {
//        System.out.println(moviesToAdd);
        sampleMovies.addAll(moviesToAdd);
    }

    private List<Movie> setMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(2, "Infinity War", "2019", "Our Savior", "Johnny Depp",  "fantasy", "My man just wanted to farm."));

        movies.add(new Movie(3, "Gladiator", "1999", "Johnny Depp", "Russel Crowe", "Action", "Best movie ever."));

        movies.add(new Movie(1, "The Big Lebowski", "1995", "The Cohen Brothers", "Jeff Bridges, John Goodman, Steve Buscemi",  "comedy, drama", "the dude just wanted to relax and go bowling."));

        return movies;
    };


}
