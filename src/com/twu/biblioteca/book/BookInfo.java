package com.twu.biblioteca.book;

import com.twu.biblioteca.constants.ConstantBookProperty;
import com.twu.biblioteca.utils.PropertiesUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookInfo {

    public List<Book> getBooksInfo() {
        List<Book> bookList = new ArrayList<Book>();
        for (String bookName : getBookNames()) {
            if(!isBookCheckedOut(bookName)){
                Book book = new Book(bookName, getBookAuthorByBookName(bookName), getBookPublishedYearByBookName(bookName));
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<String> getBookNames() {
        return Arrays.asList(ConstantBookProperty.JAVA, ConstantBookProperty.JAVASCRIPT, ConstantBookProperty.HTML);
    }

    public String getBookAuthorByBookName(String bookName) {
        return PropertiesUtils.getBookProperty(bookName + "." + ConstantBookProperty.AUTHOR);
    }

    public String getBookPublishedYearByBookName(String bookName) {
        return PropertiesUtils.getBookProperty(bookName + "." + ConstantBookProperty.YEAR);
    }

    public boolean isBookCheckedOut(String bookName) {
        String bookStatus = PropertiesUtils.getBookProperty(bookName + "." + ConstantBookProperty.STATUS);
        if (bookStatus.equals("0")){
            return false;
        }
        return true;
    }

    public boolean isBookBelongsToLibrary(String bookName) {
        return getBookNames().contains(bookName);
    }

    public boolean isBookAvailableToCheckout(String bookName) {
        return isBookBelongsToLibrary(bookName)&&(!isBookCheckedOut(bookName));
    }
}
