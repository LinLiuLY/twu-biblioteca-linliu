package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.product.ProductInfo;
import com.twu.biblioteca.utils.OutPutUtils;

import java.util.Scanner;

public class BookMenuCtl {

    public static void showBookMenu() {
        OutPutUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutPutUtils.outPutBooksInfo(new ProductInfo().getBookNames());
        OutPutUtils.outputMessage(ConstantOutputMessage.BOOK_MENU);
        OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_BOOK);
        OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_RETURN_BOOKS);
    }

    public static void chooseBookMenuOption(String option, String input) {
        if (option.equals("1") || option.equals("2")) {
            getInputBookName(input);
        } else  {
            OutPutUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public static void getInputBookName(String option) {
        OutPutUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
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
            new ProductInfo().setProductStatus(bookName, "0");
            OutPutUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_RETURN);
        } else {
            OutPutUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_RETURN);
        }
    }
}
