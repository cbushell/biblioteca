package com.twu.biblioteca;

public class LibraryView {

    private final Library library;

    public LibraryView(Library library) {
        this.library = library;
    }

    public void displayOptions() {
        System.out.println("List Books");
    }

    public void displayWelcomMessage() {
        System.out.println("Welcome to Biblioteca");
    }

    public void displayBooksSummary() {
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYearPublished());
        }
    }

}
