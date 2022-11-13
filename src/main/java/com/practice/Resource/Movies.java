package com.practice.Resource;

public class Movies {


    private String userId;
    private String MovieName;
    private int rating;

    public Movies(String userId, String movieName, int rating) {
        this.userId = userId;
        MovieName = movieName;
        this.rating = rating;
    }
    public Movies(){

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
