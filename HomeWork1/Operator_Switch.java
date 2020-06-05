package HomeWork1;

import java.util.Scanner;

public class Operator_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String somebodyName = scanner.nextLine();
        switch (somebodyName) {
            default:{
                System.out.println("А вы кто?");
                break;
            }
            case "Вася" :{
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            }
            case "Анастасия" :{
                System.out.println("Я тебя так долго ждал");
                break;
            }
        }
    }
}
