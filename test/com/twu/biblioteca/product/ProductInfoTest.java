package com.twu.biblioteca.product;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductInfoTest {
    @Test
    public void isProductCheckedOutTest() {
        assertFalse("book is not checked out", new ProductInfo().isProductCheckedOut("HeadFirstJava"));
        assertFalse("movie is not checked out", new ProductInfo().isProductCheckedOut("movieOne"));
    }

    @Test
    public void isProductBelongsToLibraryTest() {
        assertTrue("book belongs to the library", new ProductInfo().isProductBelongsToLibrary("book", "HeadFirstJavaScript"));
        assertFalse("book does not belong to the library", new ProductInfo().isProductBelongsToLibrary("book", "CSS"));
        assertTrue("movie belongs to the library", new ProductInfo().isProductBelongsToLibrary("movie", "movieOne"));
        assertFalse("movie does not belong to the library", new ProductInfo().isProductBelongsToLibrary("movie", "movieThree"));
    }

    @Test
    public void isProductAvailableToCheckout() {
        assertTrue("book is available", new ProductInfo().isProductAvailableToCheckout("book", "HeadFirstHtml"));
        assertFalse("book is unavailable", new ProductInfo().isProductAvailableToCheckout("book", "CSS"));
        assertTrue("movie is available", new ProductInfo().isProductAvailableToCheckout("movie", "movieTwo"));
        assertFalse("movie is unavailable", new ProductInfo().isProductAvailableToCheckout("movie", "movieThree"));
    }

    @Test
    public void getBookNamesTest() {
        assertEquals("should return book name list.", Arrays.asList("HeadFirstJava", "HeadFirstJavaScript", "HeadFirstHtml"), new ProductInfo().getBookNames());
    }
}
