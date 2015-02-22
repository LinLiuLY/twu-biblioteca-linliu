package com.twu.biblioteca.utils;

import com.twu.biblioteca.constants.ConstantFileName;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

    public static String getBookProperty(String propertyKey) {
        Properties prop = new Properties();
        InputStream input = null;
        String value = "";
        try {
            input = PropertiesUtils.class.getClassLoader().getResourceAsStream(ConstantFileName.BOOKS_INFORMATION);
            if (input == null) {
                System.out.println("Sorry, unable to find the file " + ConstantFileName.BOOKS_INFORMATION);
                return null;
            }
            prop.load(input);
            value = prop.getProperty(propertyKey);
            if (value == null) {
                System.out.println("Sorry , unable to find the value which key is " + propertyKey);
                return null;
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return value;
    }
}

