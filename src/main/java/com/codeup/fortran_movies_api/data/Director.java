package com.codeup.fortran_movies_api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "director")
    @JsonIgnoreProperties("director")
    private List<Movie> directorOfMovie;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Director() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getDirectorOfMovie() {
        return directorOfMovie;
    }

    public void setDirectorOfMovie(List<Movie> directorOfMovie) {
        this.directorOfMovie = directorOfMovie;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
