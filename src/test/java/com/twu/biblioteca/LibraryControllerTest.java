package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class LibraryControllerTest {

    private final Book[] books = new Book[]{};

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldPrintWelcomMessage() {
        String welcomeMessage = "Foo bar baz!";

        Library library = new Library(books);
        LibraryCommand[] commands = new LibraryCommand[]{};

        new LibraryController(library, welcomeMessage, commands).run();
        assertEquals(welcomeMessage, stdOut.toString().trim());
    }

    @Test
    public void itShouldDisplayTheListOfOptions() {
        String welcomeMessage = "";

        Library library = new Library(books);
        LibraryCommand[] commands = new LibraryCommand[]{
                new NullLibraryCommand("Foo", library),
                new NullLibraryCommand("Bar", library)
        };

        new LibraryController(library, welcomeMessage, commands).run();
        assertEquals("0 - Foo\n1 - Bar", stdOut.toString().trim());
    }

    private class NullLibraryCommand extends LibraryCommand {
        public NullLibraryCommand(String name, Library library) {
            super(name, library);
        }

        @Override
        public void execute() {
        }
    }


}