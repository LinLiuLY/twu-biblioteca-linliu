package com.twu.biblioteca.info;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.Product;
import com.twu.biblioteca.utils.OutputUtils;

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

    public static void checkoutProduct(String type, String name) {
        Product product = getProduct(type, name);

        if (product != null) {
            product.toCheckout();
        }
    }

    public static void returnProduct(String type, String name) {
        Product product = getProduct(type, name);

        if (product != null) {
            product.toReturn();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_RETURN);
        }
    }

    private static Product getProduct(String type, String name) {
        List<? extends Product> products = allInfo.get(type);
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }

        return null;
    }
}
