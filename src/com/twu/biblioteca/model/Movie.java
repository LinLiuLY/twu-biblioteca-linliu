package com.twu.biblioteca.model;

/**
 * Created by linliu on 2/24/15.
 */
public class Movie extends Product {

    private int rating;

    public Movie() {
        super();
    }

    public Movie(String name, String status, String author, String yearPublished, int rating) {
        super(name, status, author, yearPublished);
        this.rating = rating;
    }

    public void print() {
        System.out.printf("%s %s %s %s\n", getName(), getAuthor(), getYearPublished(), getRating());
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
