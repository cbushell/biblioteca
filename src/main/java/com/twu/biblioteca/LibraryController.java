package com.twu.biblioteca;


public class LibraryController {

    private final String welcomeMessage;

    private final Library library;
    private final LibraryCommand[] libraryCommands;

    public LibraryController(Library library, String welcomeMessage, LibraryCommand[] libraryCommands) {
        this.library = library;
        this.welcomeMessage = welcomeMessage;
        this.libraryCommands = libraryCommands;
    }

    public void run() {
        if (welcomeMessage != null && !welcomeMessage.isEmpty()) {
            System.out.println(welcomeMessage);
        }

        for (int i = 0; i < libraryCommands.length; i++) {
            System.out.println(i + " - " + libraryCommands[i].getName());
        }
    }

}
