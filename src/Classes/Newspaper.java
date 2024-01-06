package Classes;


import Interfaces.LibraryItem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Newspaper implements LibraryItem, Serializable {
    private String title;
    private java.util.Date releaseDate;
    private List<String> headlines;

    public Newspaper(String title, Date releaseDate, List<String> headlines) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.headlines = headlines;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return null;// Газета не имеет автора
    }

    @Override
    public void printInfo() {
        System.out.println("\nГазета \nНазвание: " + title +
                "\nДата выпуска: " + releaseDate + "\nЗаголовки: " + headlines);
    }
}
