package com.twu.biblioteca.menu;

import com.twu.biblioteca.book.BookInfo;
import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

public class MainMenuCtl {

   public void mainMenu() {
       showMainMenu();
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       while (!input.equalsIgnoreCase("exit")) {
           chooseOption(input);
           input = sc.nextLine();
       }
   }

    public void showMainMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.MAIN_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_BOOKS);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_BOOK);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_RETURN_BOOKS);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_QUIT);
    }

    public void showBookList() {
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutputUtils.outPutBooksInfo(new BookInfo().getBooksInfo());
    }

    public void chooseOption(String option) {
        if (option.equals("1")) {
            showBookList();
        } else if (option.equals("2")) {
            checkoutBookMenu();
        } else if (option.equals("3")) {
            returnBookMenu();
        } else if (option.equals("0")) {
            exitMainMenu();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public void exitMainMenu() {
        System.exit(0);
    }

    public void checkoutBookMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            BookMenuCtl.checkoutBook(input);
            input = sc.nextLine();
        }
    }

    public void returnBookMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            BookMenuCtl.returnBook(input);
            input = sc.nextLine();
        }
    }

}
