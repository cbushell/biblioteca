package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    private final Book[] books = new Book[]{
            new Book("Charlie and the Chocolate Factory", "Roald Dahl", 1964),
            new Book("The Catcher in the Rye", "J.D. Salinger", 1951)
    };

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        new Library(books).listBooks();
        assertEquals(stdOut.toString(), "Charlie and the Chocolate Factory, Roald Dahl, 1964\nThe Catcher in the Rye, J.D. Salinger, 1951\n");
    }

}