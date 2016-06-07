package com.twu.biblioteca;


public class LibraryController {

    private final Library library;
    private final LibraryView libraryView;
    private final LibraryCommand[] libraryCommands;

    public LibraryController(Library library, LibraryView libraryView, LibraryCommand[] libraryCommands) {
        this.library = library;
        this.libraryView = libraryView;
        this.libraryCommands = libraryCommands;
    }

    public void run() {
        this.libraryView.displayWelcomMessage();

        for (int i = 0; i < libraryCommands.length; i++) {
            System.out.println(i + " - " + libraryCommands[i].getName());
        }
    }

}
