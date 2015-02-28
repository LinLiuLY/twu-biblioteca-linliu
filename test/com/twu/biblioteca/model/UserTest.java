package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by linliu on 2/25/15.
 */
public class UserTest {
    User user;

    @Before
    public void setup() {
        user = new User();
    }

    @After
    public void tearDown() {
        user = null;
    }

    @Test
    public void userShouldHaveName() {
        user.setName("Anny");
        assertEquals("Anny", user.getName());
    }

    @Test
    public void userShouldHaveEmailAddress() {
        user.setEmail("anny@gmail.com");
        assertEquals("anny@gmail.com", user.getEmail());
    }

    @Test
    public void userShouldHavePhoneNumber() {
        user.setPhone("12333456789");
        assertEquals("12333456789", user.getPhone());
    }

    @Test
    public void userShouldHaveLibraryNumber() {
        user.setLibraryNumber("123-3456");
        assertEquals("123-3456", user.getLibraryNumber());
    }

    @Test
    public void userShouldHavePassword() {
        user.setPassword("123");
        assertEquals("123", user.getPassword());
    }
}
