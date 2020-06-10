package HomeWork2;

import java.util.Arrays;

/*
3.2 Cортировка массива с числами выбором
 */

public class Ex_3_2 {
    public static void main(String[] args) {
        int a [] = {5, 13, 8, 2, 1};
        System.out.print("Не отсортированный массив: ");

        for ( int b :a){
            System.out.print( b + ",");
        }
        System.out.println();

        selectIntSort(a);
        System.out.print("Массив, отсортированный  выбором: ");
        for ( int b :a){
            System.out.print( b + ",");
        }
    }

    public static void selectIntSort (int array[]){
        int min, tmp;
        for (int i = 0; i < array.length-1; i++) {
            // поиск минимального элемента
            min = i;
            for (int scan = i + 1; scan < array.length; scan++) {
                if (array[scan] < array[min]){ // вводим условие: если элемент списка меньше элемента на минимальной позиции
                min = scan; // то мы минимальный элемент передаем сканированию
            }
        }
            // если элемент списка оказался минимальным
            tmp = array[min]; // сохраняем в tmp минимальный элемент
            array[min] = array[i]; // минимальному значению массива присваиваем минимальную позицию
            array[i] = tmp; // минимальная позиция равна минимальному элементу tmp
            //далее цикл повторяется сначала с поиска минимального элемента
        }
    }
}
