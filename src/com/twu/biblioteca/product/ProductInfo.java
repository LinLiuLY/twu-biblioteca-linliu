package com.twu.biblioteca.product;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductInfo {
    public static final Map<String, List<? extends Product>> allInfo;

    static {
        allInfo = new HashMap<String, List<? extends Product>>();

        Book book1 = new Book("HeadFirstJava", "returned", "Blue", "1992");
        Book book2 = new Book("HeadFirstJavaScript", "returned", "Black", "1994");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);

        Movie movie1 = new Movie("MovieOne", "returned", "Orange", "2001", 3);
        Movie movie2 = new Movie("MovieTwo", "returned", "Red", "2010", 3);
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(movie1);
        movies.add(movie2);

        allInfo.put("book", books);
        allInfo.put("movie", movies);
    }

    public List<String> getProductNames(String type) {
        List<? extends Product> products = allInfo.get(type);
        List<String> names = new ArrayList<String>();
        for (Product product : products) {
            names.add(product.getName());
        }

        return names;
    }

    public boolean isProductCheckedOut(String productType, String productName) {
        List<? extends Product> products = allInfo.get(productType);
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (product.getStatus().equals("returned")) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isProductBelongsToLibrary(String productType, String productName) {
        return getProductNames(productType).contains(productName);
    }

    public boolean isProductAvailableToCheckout(String productType, String productName) {
        return isProductBelongsToLibrary(productType, productName) && (!isProductCheckedOut(productType, productName));
    }

    public void setProductStatus(String productType, String productName, String status) {
        List<? extends Product> products = allInfo.get(productType);
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setStatus(status);
            }
        }
    }
}
