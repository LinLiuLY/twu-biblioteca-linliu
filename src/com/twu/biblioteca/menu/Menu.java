package com.twu.biblioteca.menu;

import java.util.Scanner;

/**
 * Created by linliu on 2/26/15.
 */
public abstract class Menu {
    public void process() {
        show();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            choose(input);
            input = sc.nextLine();
        }
    }

    abstract void show();

    abstract void choose(String input);

    public void exitMenu() {
        System.exit(0);
    }
}
