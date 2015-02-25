package com.twu.biblioteca.model;

/**
 * Created by linliu on 2/24/15.
 */
public class Book extends Product {

    public Book() {
        super();
    }

    public Book(String name, String status, String author, String yearPublished) {
        super(name, status, author, yearPublished);
    }
}
