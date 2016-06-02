package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

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
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        new Library(books).listBooks();
        assertEquals(stdOut.toString(), "Charlie and the Chocolate Factory\nJames and the Giant Peach\n");
    }

}