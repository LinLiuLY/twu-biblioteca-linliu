package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.info.ProductInfo;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

/**
 * Created by linliu on 2/26/15.
 */
public class BookMenu extends Menu {
    @Override
    void show() {
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutputUtils.outputProductInfo(ConstantProductProperty.BOOK_TYPE);
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_BOOK);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_RETURN_BOOKS);
    }

    @Override
    void choose(String option) {
        if (option.equals("1")) {
            checkoutBook();
        } else {
            returnBook();
        }
    }

    public void returnBook() {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
        Scanner sc = new Scanner(System.in);
        String bookName = sc.nextLine();
        while (!bookName.equalsIgnoreCase("exit")) {
            ProductInfo.returnProduct(ConstantProductProperty.BOOK_TYPE, bookName);
        }
    }

    public void checkoutBook() {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_BOOK_NAME);
        Scanner sc = new Scanner(System.in);
        String bookName = sc.nextLine();
        while (!bookName.equalsIgnoreCase("exit")) {
            ProductInfo.checkoutProduct(ConstantProductProperty.BOOK_TYPE, bookName);
        }
    }
}
