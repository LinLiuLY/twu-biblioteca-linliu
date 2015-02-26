package com.twu.biblioteca.model;

import com.twu.biblioteca.constants.ConstantOutputMessage;
import com.twu.biblioteca.utils.OutputUtils;

/**
 * Created by linliu on 2/24/15.
 */
public class Book extends Product {

    public Book() {
        super();
    }

    public Book(String name, String status, String author, String yearPublished) {
        super(name, status, author, yearPublished);
    }

    public void toCheckout() {
        if (isCheckout()) {
            OutputUtils.outputMessage(ConstantOutputMessage.UNSUCCESSFUL_CHECKOUT_BOOK);
        } else {
            setStatus(CHECKOUT);
            OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_CHECKOUT_BOOK);
        }
    }

    public void toReturn() {
        setStatus(RETURNED);

        OutputUtils.outputMessage(ConstantOutputMessage.SUCCESSFUL_RETURN);
    }
}
