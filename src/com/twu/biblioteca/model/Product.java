package com.twu.biblioteca.model;

/**
 * Created by linliu on 2/24/15.
 */
public class Product {
    public static final String RETURNED = "returned";
    public static final String CHECKOUT = "checkout";

    private String name;
    private String status;
    private String author;
    private String yearPublished;

    public Product() {
    }

    public Product(String name, String status, String author, String yearPublished) {
        this.name = name;
        this.status = status;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void print() {
        System.out.printf("%s %s %s\n", getName(), getAuthor(), getYearPublished());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isCheckout() {
        return status.equals(CHECKOUT);
    }

    public void toCheckout() {
        setStatus(CHECKOUT);
    }

    public void toReturn() {
        setStatus(RETURNED);
    }
}
