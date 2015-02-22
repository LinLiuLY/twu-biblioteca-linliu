package com.twu.biblioteca.menu;

import com.twu.biblioteca.book.BookInfo;
import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutputUtils;

public class MenuCtl {

    public void showMainMenu() {
        OutputUtils.outputMessage(ConstantOutputMessage.MAIN_MENU);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_LIST_BOOKS);
        OutputUtils.outputMessage(ConstantOutputMessage.OPTION_QUIT);
    }

    public void showBookList() {
        OutputUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutputUtils.outPutBooksInfo(new BookInfo().getBooksInfo());
    }

    public void chooseOption(String option) {
        if (option.equals("1")) {
            showBookList();
        } else if (option.equals("0")) {
            exitMainMenu();
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.OPTION_INVALID);
        }
    }

    public void exitMainMenu() {
        System.exit(0);
    }

}
