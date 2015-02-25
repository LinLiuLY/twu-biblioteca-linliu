package com.twu.biblioteca;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.menu.UserMenuCtl;
import com.twu.biblioteca.utils.OutputUtils;

public class BibliotecaApp {
    public static void main(String[] args) {
        OutputUtils.outputMessage(ConstantOutputMessage.WELCOME);
        new UserMenuCtl().userLoginMenu();
    }
}
