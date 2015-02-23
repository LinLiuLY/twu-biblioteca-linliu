package com.twu.biblioteca.product;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductInfoTest {
    @Test
    public void isBookCheckedOutTest() {
        assertFalse("book is not checked out", new ProductInfo().isProductCheckedOut("HeadFirstJava"));
    }

    @Test
    public void isBookBelongsToLibraryTest() {
        assertTrue("book belongs to the library", new ProductInfo().isProductBelongsToLibrary("book", "HeadFirstJavaScript"));
        assertFalse("book does not belong to the library", new ProductInfo().isProductBelongsToLibrary("book", "CSS"));
    }

    @Test
    public void isBookAvailableToCheckout() {
        assertTrue("book is available", new ProductInfo().isProductAvailableToCheckout("book", "HeadFirstHtml"));
        assertFalse("book is unavailable", new ProductInfo().isProductAvailableToCheckout("book", "CSS"));
    }
}
