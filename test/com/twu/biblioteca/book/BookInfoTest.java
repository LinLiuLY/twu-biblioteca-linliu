package com.twu.biblioteca.book;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Created by linliu on 2/21/15.
 */
public class BookInfoTest {
    @Test
    public void getBooksInfoTest() {
        List<Book> bookList = new BookInfo().getBooksInfo();
        List<Book> bookListExpected = Arrays.asList(new Book("head first java", "Black", "1992"), new Book("head first javascript", "White", "1993"), new Book("head first html", "Blue", "1994"));
        for (int i = 0; i < bookListExpected.size(); i++) {
            assertEquals("should return the right book count",3, bookList.size());
            assertTrue("should return the right book info",bookListExpected.get(i).equals(bookList.get(i)));
        }
    }
}
