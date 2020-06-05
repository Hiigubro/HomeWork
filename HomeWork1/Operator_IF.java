package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Operator_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String somebodyName = scanner.nextLine();

        if (Objects.equals(somebodyName, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
            if (Objects.equals(somebodyName, "Анастасия")) {
                System.out.println("Я тебя так долго ждал");
                 return;
            }
        System.out.println("А вы кто?");
        }
    }



