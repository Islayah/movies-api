package com.codeup.fortran_movies_api.data;

public class Movie {
    private int id;
    private String title;
    private String year;
    private String director;
    private String actors;
//    private String imdbId;
    private String genre;
    private String plot;

    public Movie(int id, String title, String year, String director, String actors, String genre, String plot) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
//        this.imdbId = imdbId;
        this.genre = genre;
        this.plot = plot;
    }

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

//    public String getImdbId() {
//        return imdbId;
//    }


    public String getGenre() {
        return genre;
    }

    public String getPlot() {
        return plot;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

//    public void setImdbId(String imdbId) {
//        this.imdbId = imdbId;
//    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
//                ", imdbId='" + imdbId + '\'' +
                ", genre='" + genre + '\'' +
                ", plot='" + plot + '\'' +
                '}';
    }
}

