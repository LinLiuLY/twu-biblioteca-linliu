package com.twu.biblioteca.book;

/**
 * Created by linliu on 2/21/15.
 */
public class Book {
    String bookName;
    String booksAuthor;
    String yearPublished;

    public Book(String bookName, String booksAuthor, String yearPublished) {
        this.bookName = bookName;
        this.booksAuthor = booksAuthor;
        this.yearPublished = yearPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBooksAuthor() {
        return booksAuthor;
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
        if (!booksAuthor.equals(book.booksAuthor)) return false;
        if (!yearPublished.equals(book.yearPublished)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + booksAuthor.hashCode();
        result = 31 * result + yearPublished.hashCode();
        return result;
    }
}
