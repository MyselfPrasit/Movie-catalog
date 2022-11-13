package com.practice.Resource;

public class MovieInfo {

    private int movieId;
    private String movieName;
    private String genre;

    public int getMovieId() {
        return movieId;
    }

    public MovieInfo(int movieId, String movieName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    public MovieInfo() {
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
