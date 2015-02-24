package com.twu.biblioteca.model;

/**
 * Created by linliu on 2/24/15.
 */
public class Movie extends Product {

    private int rating;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
