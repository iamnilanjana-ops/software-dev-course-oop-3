package org.example;

public class Movie extends LibraryItem {

    protected int durationInMinutes;

    public Movie(String title, String director, int year, int durationInMinutes) {
        super(title, year, director);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
    }
}