package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LibraryViewTest {

    private final Book[] books = new Book[]{
            new Book("Charlie and the Chocolate Factory", "Roald Dahl", 1964),
            new Book("The Catcher in the Rye", "J.D. Salinger", 1951)
    };

    private Library library = new Library(books);

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldListAllOptions() {
        new LibraryView(library).displayOptions();
        assertEquals(stdOut.toString(), "1 - List Books\n");
    }

    @Test
    public void itShouldDisplayAWelcomeMessage() {
        new LibraryView(library).displayWelcomMessage();
        assertEquals("Welcome to Biblioteca\n", stdOut.toString());
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        new LibraryView(library).displayBooksSummary();
        assertEquals(stdOut.toString(), "Charlie and the Chocolate Factory, Roald Dahl, 1964\nThe Catcher in the Rye, J.D. Salinger, 1951\n");
    }

}
