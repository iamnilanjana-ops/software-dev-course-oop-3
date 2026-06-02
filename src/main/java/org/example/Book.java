package org.example;

public class Book extends LibraryItem {

    protected int pageCount;

    public Book(String title, String author, int year){
        super(title, year, author);
        this.pageCount = 0;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void readBook() {
        System.out.println("Reading " + title + " by " + author + "...");
        System.out.println("Done!");
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }
}