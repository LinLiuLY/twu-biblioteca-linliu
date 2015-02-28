package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by linliu on 2/24/15.
 */
public class MovieTest {
    Movie movie;
    Movie movie2;

    @Before
    public void setup() {
        movie = new Movie();
        movie2 = new Movie("MovieTwo", "returned", "Red", "2010", 3);
    }

    @After
    public void tearDown() {
        movie = null;
        movie2 = null;
    }

    @Test
    public void movieShouldHaveName() {
        movie.setName("Java");
        assertEquals("Java", movie.getName());
    }

    @Test
    public void movieShouldHaveYearPublished() {
        movie.setYearPublished("2033");
        assertEquals("2033", movie.getYearPublished());
    }

    @Test
    public void movieShouldHaveStatus() {
        movie.setStatus("checkout");
        assertEquals("checkout", movie.getStatus());
    }

    @Test
    public void returnedMovieShouldHaveReturnStatus() {
        movie.toReturn();
        assertEquals("returned", movie.getStatus());
    }

    @Test
    public void movieShouldHaveAuthor() {
        movie.setAuthor("Jim");
        assertEquals("Jim", movie.getAuthor());
    }

    @Test
    public void movieShouldHaveRating() {
        movie.setRating(3);
        assertEquals(3, movie.getRating());
    }

    @Test
    public void movieShouldCheckout(){
        movie2.toCheckout();
        assertEquals("checkout",movie2.getStatus());
    }
}
