package com.twu.biblioteca.utils;

import com.twu.biblioteca.book.Book;

import java.util.List;

public class OutputUtils {

    public static void outputMessage(String message) {
        System.out.println(message);
    }

    public static void outPutBooksInfo(List<Book> books) {
        for (Book book : books)
            System.out.printf("%s %s %s\n", book.getBookName(), book.getBooksAuthor(), book.getYearPublished());
    }

}
