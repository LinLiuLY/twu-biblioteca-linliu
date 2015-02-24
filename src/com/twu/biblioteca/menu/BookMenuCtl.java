package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.product.ProductInfo;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

public class BookMenuCtl {

    public static void showBookMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutputUtils.outputProductInfo(ConstantProductProperty.BOOK_TYPE);
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_BOOK);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_RETURN_BOOKS);
    }

    public static void chooseBookMenuOption(String option, String input) {
        if (option.equals("1") || option.equals("2")) {
            getInputBookName(input);
        } else  {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public static void getInputBookName(String option) {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
        Scanner sc = new Scanner(System.in);
        String bookName = sc.nextLine();
        while (!bookName.equalsIgnoreCase("exit")) {
            if (option.equals("1")) {
                ProductMenuCtl.checkoutProduct(ConstantProductProperty.BOOK_TYPE, bookName);
            } else {
                returnBook(bookName);
            }
            bookName = sc.nextLine();
        }
    }

    public static void returnBook(String bookName) {
        if (new ProductInfo().isProductBelongsToLibrary(ConstantProductProperty.BOOK_TYPE, bookName)) {
            new ProductInfo().setProductStatus(ConstantProductProperty.BOOK_TYPE, bookName, "0");
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_RETURN);
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_RETURN);
        }
    }
}
