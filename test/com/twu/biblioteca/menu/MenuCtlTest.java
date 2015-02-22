package com.twu.biblioteca.menu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MenuCtlTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void chooseOption_oneAsParam() {
        MenuCtl menuCtl = new MenuCtl();
        menuCtl.chooseOption("1");
        assertTrue("should print book info", outContent.toString().contains("HeadFirstJava"));
    }

    @Test
    public void chooseOption_invalidParam() {
        MenuCtl menuCtl = new MenuCtl();
        menuCtl.chooseOption("e");
        assertTrue("should print error message", outContent.toString().contains("valid option"));
    }
}