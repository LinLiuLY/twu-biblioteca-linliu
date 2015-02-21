package com.twu.biblioteca.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by linliu on 2/21/15.
 */
public class BookInfo {

    public List<Book> getBooksInfo() {
        List<Book> bookList = new ArrayList<Book>();
        return Arrays.asList(new Book("head first java", "Black", "1992"), new Book("head first javascript", "White", "1993"), new Book("head first html", "Blue", "1994"));
    }
}
