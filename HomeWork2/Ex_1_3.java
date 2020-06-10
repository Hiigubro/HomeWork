package HomeWork2;

import java.util.Scanner;

/*
1.3. Все цифры из числа введенного через аргумент к исполняемой программе
перемножить между собой и вывести ход вычислений в консоль
 */

public class Ex_1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        int mult = 1;
        int currentDidgit;
        for ( int i = 10; i < number; ){
            currentDidgit = number % 10;
            mult = mult * currentDidgit;
            number = number / 10;
        }
        System.out.println(mult);
    }
}
