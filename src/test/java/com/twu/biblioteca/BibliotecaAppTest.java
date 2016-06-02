package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class BibliotecaAppTest {

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    private final Book[] books = new Book[]{
            new Book("Charlie and the Chocolate Factory"),
            new Book("James and the Giant Peach")
    };

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }


    @Test
    public void itShouldPrintWelcomMessage() {
        WelcomeMessagePrinter welcomeMessagePrinter = new WelcomeMessagePrinter();
        new BibliotecaApp(books, welcomeMessagePrinter);

        // TODO: on train, can't donwload mockito now. Write test to mock WelcomeMEssagePrinter and checkwelcome message is printed
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        WelcomeMessagePrinter welcomeMessagePrinter = new WelcomeMessagePrinter();
        new BibliotecaApp(books, welcomeMessagePrinter).run();

        assertTrue(stdOut.toString().contains("Charlie and the Chocolate Factory\nJames and the Giant Peach\n"));
    }

}
