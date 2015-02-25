package com.twu.biblioteca.utils;

import com.twu.biblioteca.model.Product;
import com.twu.biblioteca.info.ProductInfo;

public class OutputUtils {

    public static void outputMessage(String message) {
        System.out.println(message);
    }

    public static void outputProductInfo(String type) {
        for (Product product : ProductInfo.allInfo.get(type)) {
            product.print();
        }
    }

}
