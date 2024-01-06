package Classes;

import Interfaces.LibraryItem;

import java.io.Serializable;
import java.util.List;

public class Almanac implements LibraryItem, Serializable {
    private String title;
    private List<Book> works;

    public Almanac(String title, List<Book> works) {
        this.title = title;
        this.works = works;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return null;// Альманах не имеет автора
    }

    @Override
    public void printInfo() {
        System.out.println("\nАльманах\nНазвание: " + title + " Работа: ");
        for (Book book : works) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
