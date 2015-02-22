package com.twu.biblioteca.utils;

import com.twu.biblioteca.book.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

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
    public void outputMessageTest() {
        OutputUtils.outputMessage("welcome");
        assertTrue("should print welcome", outContent.toString().contains("welcome"));
    }

    @Test
    public void outPutBooksInfoTest() {
        List<Book> bookListExpected = Arrays.asList(new Book("HeadFirstJava", "Black", "1992"), new Book("HeadFirstJavaScript", "White", "1993"), new Book("HeadFirstHtml", "Blue", "1994"));
        OutputUtils.outPutBooksInfo(bookListExpected);
        assertTrue("should print book name", outContent.toString().contains("HeadFirstJava"));
        assertTrue("should print book author", outContent.toString().contains("Black"));
        assertTrue("should print book publish year", outContent.toString().contains("1992"));
    }


}
