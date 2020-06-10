package HomeWork2;


/*
 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 Элементы массива вводить через консоль.
 Массив хранит в себе числа.

 2.2 Вывести каждый второй элемент массива
 */

import java.util.Scanner;

public class Ex_2_2 {
    public static void main(String[] args) {

        int[] array; // массив без размера
        int n; // выделение размера памяти под массив
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int number = scanner.nextInt();

        array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Введите массив[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        /*
        2.2.1.Вывод каждого второго элемента массива в консоль при помощи while
         */

        System.out.println("Вывод каждого второго элемента массива в консоль при помощи while:");
        int i = 0;
        while (i < array.length) {
            if ( (i + 1) % 2 == 1 ) {
                System.out.println("Размер массива [" + i + "] = " + array[i]);
            }
            i++;
        }

        /*
        2.2.2.Вывод каждого второго элемента массива в консоль при помощи do ... while
         */

        System.out.println("Вывод каждого второго элемента массива в консоль при помощи do ... while:");
        i = 0;
        do{
            if ((i + 1) % 2 == 1){
                System.out.println("Размер массива [" + i + "] = " + array[i]);
            }
            i++;
        } while (i < array.length );

        /*
        2.2.3.Вывод каждого второго элемента массива в консоль при помощи for
         */

        System.out.println("Вывод каждого второго элемента массива в консоль при помощи for:");
        for ( i = 0; i < array.length; i++){
            if ((i + 1) % 2 == 1) {
                System.out.println("Размер массива [" + i + "] = " + array[i]);
            }
        }

        /*
        2.1.5.Вывод каждого второго элемента массива в консоль при помощи foreach
         */

        System.out.println("Вывод каждого второго элемента массива в консоль при помощи foreach:");
        i = 0;
        for ( int a : array) {
            if ((i + 1) % 2 == 1) {
                System.out.println("Размер массива [" + i + "] = " + a);
            }
            i++;
        }
    }
}
