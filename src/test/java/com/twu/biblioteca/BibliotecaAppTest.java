package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        Library library = new Library(books);
        WelcomeMessagePrinter welcomeMessagePrinter = new WelcomeMessagePrinter();
        new BibliotecaApp(library, welcomeMessagePrinter);

        // TODO: on train, can't donwload mockito now. Write test to mock WelcomeMessagePrinter and check welcome message is printed
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        Library library = new Library(books);
        WelcomeMessagePrinter welcomeMessagePrinter = new WelcomeMessagePrinter();

        new BibliotecaApp(library, welcomeMessagePrinter).run();
        // TODO: on train, can't donwload mockito now. Write test to mock library and check catalogue is printed
    }

}
