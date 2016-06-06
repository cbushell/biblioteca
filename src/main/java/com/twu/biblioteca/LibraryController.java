package com.twu.biblioteca;


public class LibraryController {

    private final Library library;
    private final LibraryView libraryView;

    public LibraryController(Library library, LibraryView libraryView) {
        this.library = library;
        this.libraryView = libraryView;
    }

    public void run() {
        this.libraryView.displayWelcomMessage();
        this.libraryView.displayBooksSummary();
    }

}
