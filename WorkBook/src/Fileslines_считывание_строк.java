import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileslines_считывание_строк {
    public static void main(String[] args) {
        String filePath = "C:/Users/User/Desktop/инструкция_GitHub.txt";
        System.out.println(readLineByLineJava7(filePath));
    }
    private static String readLineByLineJava7(String filePath){

        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
