package Classes;

//import java.util.ArrayList;
//import java.util.List;

import Interfaces.LibraryItem;

public class Catalog {
    private java.util.List<LibraryItem> catalogItems;

    public Catalog() {
        catalogItems = new java.util.ArrayList<>();
    }


    public void displayCatalog() {
        for (LibraryItem item : catalogItems) {
            item.printInfo();
            System.out.println();
        }
    }

    public void searchByTitle(String searchTitle) {
        for (LibraryItem item : catalogItems) {
            if (item.getTitle().equalsIgnoreCase(searchTitle)) {
                item.printInfo();
                System.out.println();
            }
        }
    }

    public void searchByAuthor(String searchAuthor) {
        for (LibraryItem item : catalogItems) {
            if (item.getAuthor() != null && item.getAuthor().equalsIgnoreCase(searchAuthor)) {
                item.printInfo();
                System.out.println();
            }
        }
    }

    public java.util.List<LibraryItem> getCatalogItems() {
        return catalogItems;
    }

    public void addItem(LibraryItem catalogItem) {
        this.catalogItems.add(catalogItem);
    }
}
