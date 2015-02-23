package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.product.ProductInfo;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

public class BookMenuCtl {

    public static void bookMenu() {
        showBookList();
        showBookMenu();
        chooseBookMenuOption();
    }

    public static void showBookList() {
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutputUtils.outPutBooksInfo(new ProductInfo().getBookNames());
    }

    public static void showBookMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_BOOK);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_RETURN_BOOKS);
    }

    public static void chooseBookMenuOption() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            if (input.equals("1") || input.equals("2")) {
                getInputBookName(input);
            } else {
                OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
            }
        }
    }

    public static void getInputBookName(String option) {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
        Scanner sc = new Scanner(System.in);
        String bookName = sc.nextLine();
        while (!bookName.equalsIgnoreCase("exit")) {
            if (option.equals("1")) {
                checkoutBook(bookName);
            } else {
                returnBook(bookName);
            }
            bookName = sc.nextLine();
        }
    }

    public static void checkoutBook(String bookName) {
        if (new ProductInfo().isProductAvailableToCheckout(ConstantProductProperty.BOOK_TYPE, bookName)) {
            new ProductInfo().setProductStatus(bookName, "1");
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_CHECKOUT);
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_CHECKOUT);
        }
    }

    public static void returnBook(String bookName) {
        if (new ProductInfo().isProductBelongsToLibrary(ConstantProductProperty.BOOK_TYPE, bookName)) {
            new ProductInfo().setProductStatus(bookName, "0");
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_RETURN);
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_RETURN);
        }
    }
}
