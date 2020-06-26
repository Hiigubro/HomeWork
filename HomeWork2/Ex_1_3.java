package HomeWork2;

import java.util.Scanner;

/*
1.3. Все цифры из числа введенного через аргумент к исполняемой программе
перемножить между собой и вывести ход вычислений в консоль
 */

public class Ex_1_3 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Массив [" + i + "] = " + args[i]);
        }

        int n = Integer.parseInt(args [0]);

        int mult = 1;
        int currentDidgit;
        for ( int i = 10; i < n; ){
            currentDidgit = n % 10;
            mult = mult * currentDidgit;
            n = n / 10;
        }
        System.out.println("Результат перемножения всех цифр из числа введенного через аргумент к исполняемой программе = " + mult);
    }
}
