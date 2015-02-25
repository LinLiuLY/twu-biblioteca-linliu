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
        Book book1 = new Book();
        book1.setName("HeadFirstJava");
        book1.setYearPublished("1992");
        book1.setStatus("returned");
        book1.setAuthor("Blue");

        Book book2 = new Book();
        book2.setName("HeadFirstJavaScript");
        book2.setYearPublished("1994");
        book2.setStatus("returned");
        book2.setAuthor("Black");

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);

        Movie movie1 = new Movie();
        movie1.setName("MovieOne");
        movie1.setYearPublished("2001");
        movie1.setStatus("returned");
        movie1.setAuthor("Orange");
        movie1.setRating(3);

        Movie movie2 = new Movie();
        movie2.setName("MovieTwo");
        movie2.setYearPublished("2010");
        movie2.setStatus("returned");
        movie2.setAuthor("Red");
        movie2.setRating(3);
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
