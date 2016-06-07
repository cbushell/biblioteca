package com.twu.biblioteca;

public class BibliotecaApp {

    public static final String welcomeMessage = "Welcome to Biblioteca";

    public static void main(String[] args) {
        Library library = new Library(new Book[]{
                new Book("Charlie and the Chocolate Factory", "Roald Dahl", 1964),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951)
        });

        LibraryCommand[] commands = new LibraryCommand[]{
                new ListBooksCommand("List Books", library)
        };

        LibraryController libraryController = new LibraryController(library, welcomeMessage, commands);
        libraryController.run();
    }

}