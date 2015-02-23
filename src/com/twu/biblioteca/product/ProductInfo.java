package com.twu.biblioteca.product;

import com.twu.biblioteca.book.BookInfo;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.utils.PropertiesUtils;

public class ProductInfo {

    public String getProductAuthorByProductName(String productName) {
        return PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.AUTHOR);
    }

    public String getProductPublishedYearByProductName(String productName) {
        return PropertiesUtils.getProductProperty(productName + "." + ConstantProductProperty.YEAR);
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
            return BookInfo.getBookNames().contains(productName);
        }
        return BookInfo.getMovieNames().contains(productName);
    }

    public boolean isProductAvailableToCheckout(String productType, String productName) {
        return isProductBelongsToLibrary(productType, productName) && (!isProductCheckedOut(productName));
    }

    public void setProductStatus(String productName, String status) {
        PropertiesUtils.setProductProperty(productName + "." + ConstantProductProperty.STATUS, status);
    }
}
