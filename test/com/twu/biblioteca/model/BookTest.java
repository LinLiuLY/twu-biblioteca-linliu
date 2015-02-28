package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by linliu on 2/24/15.
 */
public class BookTest {
    Book book;
    Book book2;

    @Before
    public void setup() {
        book = new Book();
        book2 = new Book("HeadFirstJavaScript", "returned", "Black", "1994");
    }

    @After
    public void tearDown() {
        book = null;
        book2 = null;
    }

    @Test
    public void bookShouldHaveName() {
        book.setName("HeadFirstJava");
        assertEquals("HeadFirstJava", book.getName());
    }

    @Test
    public void bookShouldHaveYearPublished() {
        book.setYearPublished("2033");
        assertEquals("2033", book.getYearPublished());
    }

    @Test
    public void bookShouldHaveStatus() {
        book.setStatus("checkout");
        assertEquals("checkout", book.getStatus());
    }

    @Test
    public void returnedBookShouldHaveReturnStatus() {
        book.toReturn();
        assertEquals("returned", book.getStatus());
    }

    @Test
    public void bookShouldHaveAuthor() {
        book.setAuthor("Jim");
        assertEquals("Jim", book.getAuthor());
    }

    @Test
    public void bookShouldCheckout(){
        book2.toCheckout();
        assertEquals("checkout",book2.getStatus());
    }

    @Test
    public void bookShouldReturn(){
        book2.toReturn();
        assertEquals("returned",book2.getStatus());
    }
}
