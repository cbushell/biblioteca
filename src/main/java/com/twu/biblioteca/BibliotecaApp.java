package com.twu.biblioteca;

public class BibliotecaApp {

    private final Book[] books;

    public BibliotecaApp(Book[] books) {
        this.books = books;
    }

    public void run() {
        System.out.println("Welcome to Biblioteca");

        for (Book book : books){
            System.out.println(book.getTitle());
        }
    }

}
