package com.twu.biblioteca;

import com.twu.biblioteca.book.BookInfo;
import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutPutUtils;

public class BibliotecaApp {
    public static void main(String[] args) {
        OutPutUtils.outputMessage(ConstantOutputMessage.WELCOME);
        OutPutUtils.outputMessage(ConstantOutputMessage.BOOK_LIST);
        OutPutUtils.outPutBooksInfo(new BookInfo().getBooksInfo());
    }
}
