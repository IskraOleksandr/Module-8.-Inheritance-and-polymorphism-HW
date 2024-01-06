package Classes;

import java.io.*;
import java.util.List;

import Interfaces.LibraryItem;
import Interfaces.LibrarySerializer;

public class CatalogFileSerializer implements LibrarySerializer {
    private String filename;

    public CatalogFileSerializer(String filename) {
        this.filename = filename;
    }

    @Override
    public void saveCatalogToFile(List<LibraryItem> catalogItems) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(catalogItems);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<LibraryItem> loadCatalogFromFile() {
        List<LibraryItem> catalogItems = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            catalogItems = (List<LibraryItem>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return catalogItems;
    }
}
