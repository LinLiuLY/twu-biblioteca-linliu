package com.twu.biblioteca.menu;

import com.twu.biblioteca.book.BookInfo;
import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutputUtils;

public class BookMenuCtl {

    public static void checkoutBook(String bookName) {
        BookInfo bookInfo = new BookInfo();
        if (bookInfo.isBookAvailableToCheckout(bookName)) {
            bookInfo.setBookStatus(bookName, "1");
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_CHECKOUT);
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_CHECKOUT);
        }
    }

    public static void returnBook(String bookName) {
        BookInfo bookInfo = new BookInfo();
        if (bookInfo.isBookBelongsToLibrary(bookName)) {
            bookInfo.setBookStatus(bookName, "0");
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_RETURN);
        } else {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_RETURN);
        }
    }
}
