package com.twu.biblioteca.book;

import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.utils.PropertiesUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookInfo {

    public List<Book> getBooksInfo() {
        List<Book> bookList = new ArrayList<Book>();
        for (String bookName : getBookNames()) {
            if (!isProductCheckedOut(bookName)) {
                Book book = new Book(bookName, getProductAuthorByProductName(bookName), getProductPublishedYearByProductName(bookName));
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<String> getBookNames() {
        return Arrays.asList(ConstantProductProperty.JAVA, ConstantProductProperty.JAVASCRIPT, ConstantProductProperty.HTML);
    }

    public List<String> getMovieNames() {
        return Arrays.asList(ConstantProductProperty.MOVIE_ONE, ConstantProductProperty.MOVIE_TWO);
    }

    public String getProductAuthorByProductName(String productName) {
        return PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.AUTHOR);
    }

    public String getProductPublishedYearByProductName(String productName) {
        return PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.YEAR);
    }

    public boolean isProductCheckedOut(String productName) {
        String productStatus = PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.STATUS);
        if (productStatus.equals("0")) {
            return false;
        }
        return true;
    }

    public boolean isProductBelongsToLibrary(String productType, String productName) {
        if (productType.equals(ConstantProductProperty.BOOK_TYPE)) {
            return getBookNames().contains(productName);
        }
        return getMovieNames().contains(productName);
    }

    public boolean isProductAvailableToCheckout(String productType, String productName) {
        return isProductBelongsToLibrary(productType, productName) && (!isProductCheckedOut(productName));
    }

    public void setProductStatus(String productName, String status) {
        PropertiesUtils.setProductProperty(productName + "." + ConstantProductProperty.STATUS, status);
    }
}
