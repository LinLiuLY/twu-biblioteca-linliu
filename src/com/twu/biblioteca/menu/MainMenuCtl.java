package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

public class MainMenuCtl {

    public static void mainMenu(User user) {
        showMainMenu();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            chooseOption(input,user);
            input = sc.nextLine();
        }
    }

    public static void showMainMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.MAIN_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_BOOKS);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_MOVIES);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_USER_ACCOUNT);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_QUIT);
    }

    public static void chooseOption(String option,User user) {
        if (option.equals("1") || option.equals("2")) {
            ProductMenuCtl.productMenu(option);
        } else if(option.equals("3")){
            user.print();
        }
        else if (option.equals("0")) {
            exitMainMenu();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public static void exitMainMenu() {
        System.exit(0);
    }
}
