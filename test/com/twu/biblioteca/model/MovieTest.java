package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by linliu on 2/24/15.
 */
public class MovieTest {
    Movie movie;

    @Before
    public void setup() {
        movie = new Movie();
    }

    @After
    public void tearDown() {
        movie = null;
    }

    @Test
    public void movieShouldHaveName() {
        movie.setName("HeadFirstJava");
        assertNotNull(movie.getName());
    }

    @Test
    public void movieShouldHaveYearPublished() {
        movie.setYearPublished("2033");
        assertEquals(movie.getYearPublished(), "2033");
    }

    @Test
    public void movieShouldHaveStatus() {
        movie.setStatus("checkout");
        assertEquals(movie.getStatus(), "checkout");
    }

    @Test
    public void returnedMovieShouldHaveReturnStatus() {
        movie.toReturn();
        assertEquals(movie.getStatus(), "returned");
    }

    @Test
    public void movieShouldHaveAuthor() {
        movie.setAuthor("Jim");
        assertEquals(movie.getAuthor(), "Jim");
    }

    @Test
    public void movieShouldHaveRating() {
        movie.setRating(3);
        assertEquals(movie.getRating(), 3);
    }
}
