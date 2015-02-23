package com.twu.biblioteca.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class PropertiesUtilsTest {

    @Test
    public void getBookProperty_KeyIsExistAsParam() {
        assertEquals("The key in the properties is exist.", "HeadFirstJava", PropertiesUtils.getBookProperty("HeadFirstJava.bookName"));
    }

    @Test(expected = NullPointerException.class)
    public void getBookProperty_KeyIsNotExistAsParam() {
        assertNull("The key in the properties is not exist.", PropertiesUtils.getBookProperty("HeadFirstCSS.bookName"));
    }

    @Test(expected = RuntimeException.class)
    public void getBookProperty_NullAsParam() {
        PropertiesUtils.getBookProperty(null);
    }

    @Test
    public void setBookProperty_KeyIsExistAsParam() {
        PropertiesUtils.setBookProperty("HeadFirstJava.status", "1");
        assertEquals("The key in the properties is exist.", "1", PropertiesUtils.getBookProperty("HeadFirstJava.status"));
    }
}
