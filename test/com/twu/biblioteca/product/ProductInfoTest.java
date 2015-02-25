package com.twu.biblioteca.product;

import com.twu.biblioteca.model.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ProductInfoTest {
    @Test
    public void shouldLoadCorrectProductInfo() {
        Map<String, List<? extends Product>> productInfo = ProductInfo.allInfo;
        assertEquals(productInfo.get("book").size(), 2);
        assertEquals(productInfo.get("movie").size(), 2);
    }

    @Test
    public void isProductCheckedOutTest() {
        assertFalse("book is not checked out", new ProductInfo().isProductCheckedOut("book", "HeadFirstJava"));
        assertFalse("movie is not checked out", new ProductInfo().isProductCheckedOut("movie", "MovieOne"));
    }

    @Test
    public void isProductBelongsToLibraryTest() {
        assertTrue("book belongs to the library", new ProductInfo().isProductBelongsToLibrary("book", "HeadFirstJavaScript"));
        assertFalse("book does not belong to the library", new ProductInfo().isProductBelongsToLibrary("book", "CSS"));
        assertTrue("movie belongs to the library", new ProductInfo().isProductBelongsToLibrary("movie", "MovieOne"));
        assertFalse("movie does not belong to the library", new ProductInfo().isProductBelongsToLibrary("movie", "movieThree"));
    }

    @Test
    public void isProductAvailableToCheckoutTest() {
        assertTrue("book is available", new ProductInfo().isProductAvailableToCheckout("book", "HeadFirstJava"));
        assertFalse("book is unavailable", new ProductInfo().isProductAvailableToCheckout("book", "CSS"));
        assertTrue("movie is available", new ProductInfo().isProductAvailableToCheckout("movie", "MovieTwo"));
        assertFalse("movie is unavailable", new ProductInfo().isProductAvailableToCheckout("movie", "movieThree"));
    }

    @Test
    public void getBookNamesTest() {
        assertEquals("should return book name list.", Arrays.asList("HeadFirstJava", "HeadFirstJavaScript"), new ProductInfo().getProductNames("book"));
    }
}
