package com.twu.biblioteca.model;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutputUtils;

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

    public void toCheckout() {
        if (isCheckout()) {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_CHECKOUT_MOVIE);
        } else {
            setStatus(CHECKOUT);
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_CHECKOUT_MOVIE);
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
