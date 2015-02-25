package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.product.UserInfo;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

/**
 * Created by linliu on 2/25/15.
 */
public class UserMenuCtl {

    public void userLoginMenu() {
        if (new UserInfo().isUserAuthenticated(getUserName(), getPassword())) {
            new MainMenuCtl().mainMenu();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.YOUR_ACCOUNT_IS_NOT_AUTHENTICATED);
        }
    }

    public String getUserName() {
        OutputUtils.outputMessage(ConstantOutputMessage.ENTER_YOUR_LIBRARY_NUMBER);
        Scanner sc = new Scanner(System.in);
        String libraryNumber = sc.nextLine();
        if (!libraryNumber.equals("")) {
            return libraryNumber;
        }
        return null;
    }

    public String getPassword() {
        OutputUtils.outputMessage(ConstantOutputMessage.ENTER_YOUR_PASSWORD);
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if (!password.equals("")) {
            return password;
        }
        return null;
    }
}
