package com.twu.biblioteca.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class PropertiesUtilsTest {

    @Test
    public void getBookProperty_KeyIsExistAs1stParam() {
        assertEquals("The key in the properties is exist.", "HeadFirstJava", PropertiesUtils.getBookProperty("HeadFirstJava.bookName"));
    }

    @Test(expected = NullPointerException.class)
    public void getBookProperty_KeyIsNotExistAs1stParam() {
        assertNull("The key in the properties is not exist.", PropertiesUtils.getBookProperty("HeadFirstCSS.bookName"));
    }

    @Test(expected = RuntimeException.class)
    public void getBookProperty_NullAs1stParam() {
        PropertiesUtils.getBookProperty(null);
    }
}
