package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryControllerTest {

    private final Book[] books = new Book[]{};

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldPrintWelcomMessage() {
        Library library = new Library(books);
        LibraryView libraryView = mock(LibraryView.class);

        new LibraryController(library, libraryView).run();
        verify(libraryView).displayWelcomMessage();
    }

    @Test
    public void itShouldDisplayTheListOfBooksInTheLibrary() {
        Library library = mock(Library.class);
        LibraryView libraryView = mock(LibraryView.class);

        new LibraryController(library, libraryView).run();
        verify(libraryView).displayBooksSummary();
    }


}