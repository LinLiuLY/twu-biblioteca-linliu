package com.twu.biblioteca.utils;

import com.twu.biblioteca.constants.ConstantFileName;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {
    public static final Properties prop = new Properties();

    public static String getProductProperty(String propertyKey, String path) {
        InputStream input = null;
        String value = "";
        try {
            input = new FileInputStream(path);
            if (input == null) {
                System.out.println("Sorry, unable to find the file " + path);
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

    public static void setProductProperty(String propertyKey, String propertyValue) {
        OutputStream output = null;
        try {
            output = new FileOutputStream(ConstantFileName.PRODUCT_INFORMATION);
            prop.setProperty(propertyKey, propertyValue);
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}