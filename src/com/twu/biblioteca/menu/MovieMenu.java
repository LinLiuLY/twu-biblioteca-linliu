package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.info.ProductInfo;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

/**
 * Created by linliu on 2/26/15.
 */
public class MovieMenu extends Menu {
    @Override
    void show() {
        OutputUtils.outputMessage(ConstantOutputMessage.MOVIE_LIST);
        OutputUtils.outputProductInfo(ConstantProductProperty.MOVIE_TYPE);
        OutputUtils.outputMessage(ConstantOutputMessage.MOVIE_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_MOVIE);
    }

    @Override
    void choose(String input) {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_MOVIE_NAME);
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        while (!in.equalsIgnoreCase("exit")) {
            new ProductInfo().checkoutProduct(ConstantProductProperty.MOVIE_TYPE, in);

            in = sc.nextLine();
        }
    }
}
