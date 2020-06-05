package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Operator_Else_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String somebodyName = scanner.nextLine();

        if (Objects.equals(somebodyName, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(somebodyName, "Анастасия")){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("А вы кто?");
        }
    }
}
