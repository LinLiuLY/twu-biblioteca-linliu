package com.twu.biblioteca.utils;

import com.twu.biblioteca.product.ProductInfo;

import java.util.List;

public class OutputUtils {

    public static void outputMessage(String message) {
        System.out.println(message);
    }

    public static void outPutBooksInfo(List<String> bookNames) {
        ProductInfo productInfo = new ProductInfo();
        for (String bookName : bookNames)
            System.out.printf("%s %s %s\n", bookName, productInfo.getProductAuthorByProductName(bookName), productInfo.getProductPublishedYearByProductName(bookName));
    }

}
