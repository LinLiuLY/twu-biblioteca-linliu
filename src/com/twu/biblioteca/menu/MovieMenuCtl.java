package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.constants.ConstantProductProperty;
import com.twu.biblioteca.product.ProductInfo;
import com.twu.biblioteca.utils.OutputUtils;

import java.util.Scanner;

public class MovieMenuCtl {

    public static void showMovieMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.MOVIE_LIST);
        OutputUtils.outputMoviesInfo(new ProductInfo().getMovieNames());
        OutputUtils.outputMessage(ConstantOutputMessage.MOVIE_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_CHECK_OUT_MOVIE);
    }

    public static void chooseMovieMenuOption(String option, String input) {
        if (option.equals("2")) {
            getInputMovieName(input);
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public static void getInputMovieName(String option) {
        OutputUtils.outputMessage(ConstantOutputMessage.PLEASE_ENTER_MOVIE_NAME);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            if (option.equals("1")) {
                ProductMenuCtl.checkoutProduct(ConstantProductProperty.MOVIE_TYPE, input);
            } else {
                return;
            }
            input = sc.nextLine();
        }
    }
}
