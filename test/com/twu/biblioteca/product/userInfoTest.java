package com.twu.biblioteca.product;

import com.twu.biblioteca.info.UserInfo;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by linliu on 2/25/15.
 */
public class UserInfoTest {
    @Test
    public void shouldLoadCorrectProductInfo() {
        List<User> userInfo = UserInfo.userInfo;
        assertEquals(userInfo.size(), 2);
    }

    @Test
    public void isUserAuthenticatedTest() {
        assertNotNull("user is authenticated", new UserInfo().isUserAuthenticated("123-1234", "111234"));
        assertNull("user is not authenticated", new UserInfo().isUserAuthenticated("123-1234", "1112034"));
    }

}
