package com.twu.biblioteca.info;

import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linliu on 2/25/15.
 */
public class UserInfo {
    public static final List<User> userInfo;

    static {
        userInfo = new ArrayList<User>();
        User user1 = new User("Ammy", "Ammy@gmail.com", "12234567890", "123-1234", "111234");
        User user2 = new User("Sql", "Sql@gmail.com", "1334567894", "123-5678", "1112223");
        userInfo.add(user1);
        userInfo.add(user2);
    }


    public static User isUserAuthenticated(String libraryNumber, String password) {
        for (User user : userInfo) {
            if ((user.getLibraryNumber().equals(libraryNumber)) && (user.getPassword().equals(password))) {
                return user;
            }
        }
        return null;
    }
}
