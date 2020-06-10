package HomeWork2;

import java.util.Scanner;

/*
 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 Элементы массива вводить через консоль.
 Массив хранит в себе числа.
 */
public class Ex_2_1 {
    public static void main(String[] args) {

        /*
         2.1.1.Ввод элементов массива через консоль
         */

        int[] array; // массив без размера
        int n; // выделение размера памяти под массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int number = scanner.nextInt();

        array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Введите массив[" + i + "] = ");
            array[i] = scanner.nextInt();
            }

        /*
        2.1.2.Вывод элементов В консоль при помощи while
         */

        System.out.println("Вывод элементов В консоль при помощи while:");
        int i = 0;
        while (i < array.length) {
            System.out.println("Размер массива [" + i + "] = " + array[i]);
            i++;
        }

        /*
        2.1.3.Вывод элементов В консоль при помощи do ... while
         */

        System.out.println("Вывод элементов В консоль при помощи do ... while:");
        i = 0;
        do{
            System.out.println("Размер массива [" + i + "] = " + array[i]);
            i++;
        } while (i < array.length );

        /*
        2.1.4.Вывод элементов В консоль при помощи for
         */

        System.out.println("Вывод элементов В консоль при помощи for:");
        for ( i = 0; i < array.length; i++){
            System.out.println("Размер массива [" + i + "] = " + array[i]);
        }

        /*
        2.1.5.Вывод элементов В консоль при помощи foreach
         */

        System.out.println("Вывод элементов В консоль при помощи foreach:");
        i = 0;
        for ( int a : array) {
            System.out.println("Размер массива [" + i + "] = " + a);
            i++;
        }
    }
}

