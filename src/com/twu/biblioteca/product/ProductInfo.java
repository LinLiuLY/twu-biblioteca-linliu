package com.twu.biblioteca.product;

import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.utils.PropertiesUtils;

import java.util.Arrays;
import java.util.List;

public class ProductInfo {

    public static List<String> getBookNames() {
        return Arrays.asList(ConstantProductProperty.JAVA, ConstantProductProperty.JAVASCRIPT, ConstantProductProperty.HTML);
    }

    public static List<String> getMovieNames() {
        return Arrays.asList(ConstantProductProperty.MOVIE_ONE, ConstantProductProperty.MOVIE_TWO);
    }

    public String getProductAuthorByProductName(String productName) {
        return PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.AUTHOR);
    }

    public String getProductPublishedYearByProductName(String productName) {
        return PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.YEAR);
    }

    public String getMovieRatingByMovieName(String movieName) {
        return PropertiesUtils.getProductProperty(movieName + "." + ConstantProductProperty.RATING);
    }

    public boolean isProductCheckedOut(String productName) {
        String productStatus = PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.STATUS);
        if (productStatus.equals("0")) {
            return false;
        }
        return true;
    }

    public boolean isProductBelongsToLibrary(String productType, String productName) {
        if (productType.equals(ConstantProductProperty.BOOK_TYPE)) {
            return getBookNames().contains(productName);
        }
        return getMovieNames().contains(productName);
    }

    public boolean isProductAvailableToCheckout(String productType, String productName) {
        return isProductBelongsToLibrary(productType, productName) && (!isProductCheckedOut(productName));
    }

    public void setProductStatus(String productName, String status) {
        PropertiesUtils.setProductProperty(productName + "." + ConstantProductProperty.STATUS, status);
    }
}
