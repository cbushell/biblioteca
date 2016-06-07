package com.twu.biblioteca;

public abstract class LibraryCommand {

    private final String name;
    protected final Library library;

    public LibraryCommand(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public abstract void execute();

}
