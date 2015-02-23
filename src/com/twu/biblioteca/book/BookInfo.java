package com.twu.biblioteca.book;

import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.product.ProductInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookInfo {

    public static List<String> getBookNames() {
        return Arrays.asList(ConstantProductProperty.JAVA, ConstantProductProperty.JAVASCRIPT, ConstantProductProperty.HTML);
    }

    public static List<String> getMovieNames() {
        return Arrays.asList(ConstantProductProperty.MOVIE_ONE, ConstantProductProperty.MOVIE_TWO);
    }

    public List<Book> getBooksInfo() {
        List<Book> bookList = new ArrayList<Book>();
        for (String bookName : getBookNames()) {
            if (!new ProductInfo().isProductCheckedOut(bookName)) {
                Book book = new Book(bookName, new ProductInfo().getProductAuthorByProductName(bookName), new ProductInfo().getProductPublishedYearByProductName(bookName));
                bookList.add(book);
            }
        }
        return bookList;
    }

}
