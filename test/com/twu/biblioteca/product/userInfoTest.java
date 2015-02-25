package com.twu.biblioteca.product;

import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by linliu on 2/25/15.
 */
public class UserInfoTest {
    @Test
    public void shouldLoadCorrectProductInfo() {
        List<User> userInfo = UserInfo.userInfo;
        assertEquals(userInfo.size(), 2);
    }

}
