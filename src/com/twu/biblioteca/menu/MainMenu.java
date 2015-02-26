package com.twu.biblioteca.menu;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.utils.OutputUtils;

/**
 * Created by linliu on 2/26/15.
 */
public class MainMenu extends Menu {

    private final User currentUser;

    public MainMenu(User currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    void show() {
        OutputUtils.outputMessage(ConstantOutputMessage.MAIN_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_BOOKS);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_MOVIES);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_USER_ACCOUNT);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_QUIT);
    }

    @Override
    void choose(String option) {
        if (option.equals("1")) {
            new BookMenu().process();
        } else if (option.equals("2")) {
            new MovieMenu().process();
        } else if (option.equals("3")) {
            currentUser.print();
        } else if (option.equals("0")) {
            exitMenu();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }
}
