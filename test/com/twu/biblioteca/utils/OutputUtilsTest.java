package com.twu.biblioteca.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class OutputUtilsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void shouldOutputMessage() {
        OutputUtils.outputMessage("welcome");
        assertTrue(outContent.toString().contains("welcome"));
    }

    @Test
    public void shouldOutputBookInfo(){
        OutputUtils.outputProductInfo("book");
        assertTrue(outContent.toString().contains("HeadFirstJava"));
        assertTrue(outContent.toString().contains("HeadFirstJavaScript"));
    }

    @Test
    public void shouldOutputMovieInfo(){
        OutputUtils.outputProductInfo("movie");
        assertTrue(outContent.toString().contains("MovieOne"));
        assertTrue(outContent.toString().contains("MovieTwo"));
    }
}
