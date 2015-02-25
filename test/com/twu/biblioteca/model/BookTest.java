package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by linliu on 2/24/15.
 */
public class BookTest {
    Book book;

    @Before
    public void setup() {
        book = new Book();
    }

    @After
    public void tearDown() {
        book = null;
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
}
