package HomeWork7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearchMain extends EasySearch {
    public static void main(String[] args) {
        String importbook = "C:/Users/User/Desktop/Война_и_Мир.txt";

        String [] content = getImportBook(importbook).split("\n");

        EasySearch easySearch = new EasySearch();

        System.out.println("Союз 'и' встречается - " + easySearch.search(importbook, "и") + " раза.");
        System.out.println("Слово 'война' встречается - " + easySearch.search(importbook, "Война") + " раз.");
        System.out.println("Слово 'мир' встречается - " + easySearch.search(importbook, "и") + " раза.");

        }

    private static String getImportBook(String importbook) {

        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(importbook)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
