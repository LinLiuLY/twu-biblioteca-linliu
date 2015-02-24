package com.twu.biblioteca.utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PropertiesUtilsTest {

    @Test
    public void getBookProperty_KeyIsExistAsParam() {
        assertEquals("The key in the properties is exist.", "HeadFirstJava", PropertiesUtils.getProductProperty("HeadFirstJava.name"));
    }

}
