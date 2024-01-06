package Interfaces;

import java.util.List;

public interface LibrarySerializer {
    void saveCatalogToFile(List<LibraryItem> catalogItems);

    List<LibraryItem> loadCatalogFromFile();
}
