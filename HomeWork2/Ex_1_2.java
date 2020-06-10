package HomeWork2;

import java.util.Scanner;

public class Ex_1_2 {
/*
 1.2. Перемножить числа от 1 до числа (включительно)
 введеннго через аргумент к исполняемой программе
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number > 16){
            System.out.println("Число не может быть больше 16");
            return;
        }
        if (number == 0){
            System.out.println("Число не может быть равно 0");
            return;
        }

        int result = 1;
        for (int i = 1 ; i < number; i++){
            result *= (i + 1);
        }
        System.out.println(result);
    }
}
