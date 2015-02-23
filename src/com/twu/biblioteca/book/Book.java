package com.twu.biblioteca.book;

import com.twu.biblioteca.product.Product;

public class Book extends Product {
    String bookName;
    String bookAuthor;
    String yearPublished;

    public Book(String bookName, String booksAuthor, String yearPublished) {
        this.bookName = bookName;
        this.bookAuthor = booksAuthor;
        this.yearPublished = yearPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBooksAuthor() {
        return bookAuthor;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!bookName.equals(book.bookName)) return false;
        if (!bookAuthor.equals(book.bookAuthor)) return false;
        if (!yearPublished.equals(book.yearPublished)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + bookAuthor.hashCode();
        result = 31 * result + yearPublished.hashCode();
        return result;
    }
}
