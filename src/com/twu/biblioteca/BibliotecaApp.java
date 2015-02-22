package com.twu.biblioteca;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.menu.MenuCtl;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {

        OutputUtils.outputMessage(ConstantOutputMessage.WELCOME);

        MenuCtl menuCtl = new MenuCtl();
        menuCtl.showMainMenu();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            menuCtl.chooseOption(input);
            input = sc.nextLine();
        }

    }
}
