package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void itShouldDisplayAWelcomeMessage() {
        new BibliotecaApp().main(new String[0]);
        assertEquals("Welcome to Biblioteca\n", stdOut.toString());
    }

}
