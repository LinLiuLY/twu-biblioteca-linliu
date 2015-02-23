package com.twu.biblioteca.product;

public abstract class Product {
    protected String name;
    protected String author;
    protected String yearPublished;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished;
    }
}
