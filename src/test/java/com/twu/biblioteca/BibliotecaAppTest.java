package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    private final Book[] books = new Book[]{};

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldPrintWelcomMessage() {
        Library library = new Library(books);
        WelcomeMessagePrinter welcomeMessagePrinter = mock(WelcomeMessagePrinter.class);

        new BibliotecaApp(library, welcomeMessagePrinter).run();
        verify(welcomeMessagePrinter).printWelcomeMessage();
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        Library library = mock(Library.class);
        WelcomeMessagePrinter welcomeMessagePrinter = new WelcomeMessagePrinter();

        new BibliotecaApp(library, welcomeMessagePrinter).run();
        verify(library).listBooks();
    }

}
