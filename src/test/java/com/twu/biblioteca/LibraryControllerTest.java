package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
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
        LibraryCommand[] commands = new LibraryCommand[]{};

        new LibraryController(library, libraryView, commands).run();
        verify(libraryView).displayWelcomMessage();
    }

    @Test
    public void itShouldDisplayTheListOfOptions() {
        Library library = new Library(books);
        LibraryView libraryView = mock(LibraryView.class);
        LibraryCommand[] commands = new LibraryCommand[]{
                new LibraryCommand("Foo"),
                new LibraryCommand("Bar")
        };

        new LibraryController(library, libraryView, commands).run();
        assertEquals("0 - Foo\n1 - Bar\n", stdOut.toString());
    }


}