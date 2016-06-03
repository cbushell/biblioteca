package com.twu.biblioteca;

public class BibliotecaApp {

    private final Library library;
    private final WelcomeMessagePrinter welcomeMessagePrinter;

    public BibliotecaApp(Library library, WelcomeMessagePrinter welcomeMessagePrinter) {
        this.library = library;
        this.welcomeMessagePrinter = welcomeMessagePrinter;
    }

    public void run() {
        this.welcomeMessagePrinter.printWelcomeMessage();
        this.library.listBooks();
    }

}
