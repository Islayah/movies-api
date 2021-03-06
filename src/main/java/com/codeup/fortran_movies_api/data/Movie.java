package com.codeup.fortran_movies_api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String year;
    @ManyToOne
    @JsonIgnoreProperties("movieDirectors") // Explanation needed *******************
    private Director director;
    private String plot;
    private String rating;
//    @ManyToMany(mappedBy = "movies")
//    @JoinTable(name = "movie_genre")
//    @JsonIgnoreProperties("movies")
//    private List<Genre> genres;

    public Movie(int id, String title, String year, String plot, String rating) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.plot = plot;
        this.rating = rating;
    }

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

//    public List<Genre> getGenres() {
//        return genres;
//    }
//
//    public void setGenres(List<Genre> genres) {
//        this.genres = genres;
//    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", director=" + director +
                ", plot='" + plot + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

