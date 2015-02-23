package com.twu.biblioteca.utils;

import com.twu.biblioteca.product.ProductInfo;

import java.util.List;

public class OutputUtils {

    public static void outputMessage(String message) {
        System.out.println(message);
    }

    public static void outPutBooksInfo(List<String> bookNames) {
        for (String bookName : bookNames) {
            ProductInfo productInfo = new ProductInfo();
            if (!productInfo.isProductCheckedOut(bookName)) {
                System.out.printf("%s %s %s\n", bookName, productInfo.getProductAuthorByProductName(bookName), productInfo.getProductPublishedYearByProductName(bookName));
            }
        }
    }

    public static void outPutMoviesInfo(List<String> movieNames) {
        for (String movieName : movieNames) {
            ProductInfo productInfo = new ProductInfo();
            if (!productInfo.isProductCheckedOut(movieName)) {
                System.out.printf("%s %s %s %s\n", movieName, productInfo.getProductAuthorByProductName(movieName), productInfo.getProductPublishedYearByProductName(movieName), productInfo.getMovieRatingByMovieName(movieName));
            }
        }
    }

}
