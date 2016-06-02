package com.twu.biblioteca;

public class Library {

    private final Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYearPublished());
        }
    }
}
