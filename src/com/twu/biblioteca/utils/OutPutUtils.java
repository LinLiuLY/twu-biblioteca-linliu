package com.twu.biblioteca.utils;

import com.twu.biblioteca.model.Product;
import com.twu.biblioteca.product.ProductInfo;

import java.util.List;
import java.util.Map;

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
