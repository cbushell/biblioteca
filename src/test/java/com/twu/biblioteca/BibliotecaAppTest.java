package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BibliotecaAppTest {

    private final Book[] books = new Book[]{
            new Book("Charlie and the Chocolate Factory"),
            new Book("James and the Giant Peach")
    };

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldDisplayAWelcomeMessage() {
        new BibliotecaApp(books).run();
        assertTrue(stdOut.toString().contains("Welcome to Biblioteca"));
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        new BibliotecaApp(books).run();
        assertTrue(stdOut.toString().contains("Charlie and the Chocolate Factory\nJames and the Giant Peach\n"));
    }

}
