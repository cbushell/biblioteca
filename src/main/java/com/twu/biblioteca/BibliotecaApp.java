package com.twu.biblioteca;

public class BibliotecaApp {

    private final Book[] books;
    private final WelcomeMessagePrinter welcomeMessagePrinter;

    public BibliotecaApp(Book[] books, WelcomeMessagePrinter welcomeMessagePrinter) {
        this.books = books;
        this.welcomeMessagePrinter = welcomeMessagePrinter;
    }

    public void run() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

}
