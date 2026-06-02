package org.example;

public class Album extends LibraryItem {

    protected int trackCount;

    public Album(String title, String artist, int year, int trackCount) {
        super(title, year, artist);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return "Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
    }
}