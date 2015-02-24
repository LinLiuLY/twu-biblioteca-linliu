package com.twu.biblioteca.model;

/**
 * Created by linliu on 2/24/15.
 */
public class Product {
    private static final String RETURNED = "returned";

    private String name;
    private String status;
    private String author;
    private String yearPublished;

    public void print() {
        System.out.printf("%s %s %s\n", getName(), getAuthor(), getYearPublished());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void toReturn() {
        setStatus(RETURNED);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
