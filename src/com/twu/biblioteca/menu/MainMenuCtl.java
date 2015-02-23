package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutPutUtils;

import java.util.Scanner;

public class MainMenuCtl {

    public static void mainMenu() {
        showMainMenu();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            chooseOption(input);
            input = sc.nextLine();
        }
    }

    public static void showMainMenu() {
        OutPutUtils.outputMessage(ConstantOutputMessage.MAIN_MENU);
        OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_BOOKS);
        OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_MOVIES);
        OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_QUIT);
    }

    public static void chooseOption(String option) {
        if (option.equals("1") || option.equals("2")) {
            ProductMenuCtl.productMenu(option);
        } else if (option.equals("0")) {
            exitMainMenu();
        } else {
            OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public static void exitMainMenu() {
        System.exit(0);
    }
}
