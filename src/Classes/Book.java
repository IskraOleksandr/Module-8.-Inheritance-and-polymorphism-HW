package Classes;

import Interfaces.LibraryItem;

import java.io.Serializable;

public class Book implements LibraryItem, Serializable {
    private String title;
    private String author;
    private String genre;
    private int pageCount;

    public Book(String title, String author, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void printInfo() {
        System.out.println("\nКнига\nНазвание книги:" + title + "\nФИО автора: " + author +
                "\nЖанр книги: " + genre + "\nКоличество страниц: " + pageCount);
    }
}
