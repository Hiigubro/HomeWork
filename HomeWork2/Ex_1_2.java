package HomeWork2;

import java.util.Scanner;

public class Ex_1_2 {
/*
 1.2. Перемножить числа от 1 до числа (включительно)
 введеннго через аргумент к исполняемой программе
 */
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Массив [" + i + "] = " + args[i]);
        }

        int n = Integer.parseInt(args [0]);

        if (n == 0){
            System.out.println("Число должно быть больше 0");
            return;
        }

        if (n > 16){
            System.out.println("Число не должно быть больше 16");
            return;
        }

        int result = 1;
        for (int i = 1 ; i < n; i++){
            result *= (i + 1);
        }
        System.out.println("Результат перемножения числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе = " + result);
    }
}
