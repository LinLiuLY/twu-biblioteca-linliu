package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutputUtils;

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
        OutputUtils.outputMessage(ConstantOutputMessage.MAIN_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_BOOKS);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_QUIT);
    }

    public static void chooseOption(String option) {
        if (option.equals("1")) {
            BookMenuCtl.bookMenu();
        } else if (option.equals("0")) {
            exitMainMenu();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public static void exitMainMenu() {
        System.exit(0);
    }
}
