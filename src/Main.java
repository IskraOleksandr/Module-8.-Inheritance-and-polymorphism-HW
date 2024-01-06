import Classes.*;
import Interfaces.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // Добавление элементов в каталог
        catalog.addItem(new Book("Book 1", "Author 1", "Genre 1", 100));
        //catalog.addItem(new Book("Book 2", "Author 2", "Genre 2", 200));

        List<String> headlines = new ArrayList<>();
        headlines.add("Headline 1");
        headlines.add("Headline 2");
        catalog.addItem(new Newspaper("Newspaper 1", new Date(), headlines));

        List<Book> works = new ArrayList<>();
        works.add(new Book("Book 3", "Author 3", "Genre 3", 300));
        works.add(new Book("Book 4", "Author 4", "Genre 4", 400));
        catalog.addItem(new Almanac("Almanac 1", works));

        catalog.displayCatalog();// Вывод всего каталога на экран

        catalog.searchByTitle("Book 2");// Поиск по названию книги или газеты
        catalog.searchByAuthor("Author 3");// Поиск по автору

        // Сохранение каталога в файл
        CatalogFileSerializer fileSerializer = new CatalogFileSerializer(".\\\\src\\\\File.dat");
        fileSerializer.saveCatalogToFile(catalog.getCatalogItems());

        // Восстановление каталога из файла
        List<LibraryItem> restoredCatalogItems = fileSerializer.loadCatalogFromFile();
        Catalog restoredCatalogBuilder = new Catalog();
        restoredCatalogBuilder.getCatalogItems().addAll(restoredCatalogItems);

        System.out.println("\n\nВосстановленный каталог библиотеки");
        restoredCatalogBuilder.displayCatalog();// Вывод восстановленного каталога на экран
    }
}