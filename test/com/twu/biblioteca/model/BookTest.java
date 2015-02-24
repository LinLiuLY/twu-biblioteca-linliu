package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertNotNull(book.getName());
    }

    @Test
    public void bookShouldHaveYearPublished() {
        book.setYearPublished("2033");
        assertEquals(book.getYearPublished(), "2033");
    }

    @Test
    public void bookShouldHaveStatus() {
        book.setStatus("checkout");
        assertEquals(book.getStatus(), "checkout");
    }

    @Test
    public void returnedBookShouldHaveReturnStatus() {
        book.toReturn();
        assertEquals(book.getStatus(), "returned");
    }

    @Test
    public void bookShouldHaveAuthor() {
        book.setAuthor("Jim");
        assertEquals(book.getAuthor(), "Jim");
    }
}
