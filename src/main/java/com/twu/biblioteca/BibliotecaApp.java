package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Charlie and the Chocolate Factory", "Roald Dahl", 1964),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951)
        };

        LibraryCommand[] commands = new LibraryCommand[]{
                new LibraryCommand("List Books")
        };

        Library library = new Library(books);
        LibraryView libraryView = new LibraryView(library);

        LibraryController libraryController = new LibraryController(library, libraryView, commands);
        libraryController.run();
    }

}
