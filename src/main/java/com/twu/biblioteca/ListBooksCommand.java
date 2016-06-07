package com.twu.biblioteca;

public class ListBooksCommand extends LibraryCommand {

    public ListBooksCommand(String name, Library library) {
        super(name, library);
    }

    @Override
    public void execute() {
        for(Book book : library.getBooks()){
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYearPublished());
        }
    }

}