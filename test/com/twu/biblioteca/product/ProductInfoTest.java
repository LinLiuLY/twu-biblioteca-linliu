package com.twu.biblioteca.product;

import com.twu.biblioteca.info.ProductInfo;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by linliu on 2/27/15.
 */
public class ProductInfoTest {

    @Test
    public void shouldLoadCorrectProductInfo() {
        Map<String, List<? extends Product>> allInfo = ProductInfo.allInfo;
        assertEquals(allInfo.size(), 2);

        assertEquals(allInfo.get("book").size(), 2);
        assertEquals(allInfo.get("book").get(1).getName(), "HeadFirstJavaScript");
        assertEquals(allInfo.get("book").get(0).getName(), "HeadFirstJava");

        assertEquals(allInfo.get("movie").size(), 2);
        assertEquals(allInfo.get("movie").get(0).getName(), "MovieOne");
        assertEquals(allInfo.get("movie").get(1).getName(), "MovieTwo");
    }

    @Test
    public void shouldCheckoutProduct() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.checkoutProduct("book", "HeadFirstJava");
        assertEquals(Product.CHECKOUT,ProductInfo.allInfo.get("book").get(0).getStatus());
    }

    @Test
    public void shouldReturnProduct() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.returnProduct("book", "HeadFirstJava");
        assertEquals(Product.RETURNED,ProductInfo.allInfo.get("book").get(0).getStatus());
    }

}
