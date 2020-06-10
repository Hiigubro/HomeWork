package HomeWork2;

/*
3.1 Cортировка массива с числами пузырьком
 */

import java.util.Arrays;

public class Ex_3_1 {
    public static void main(String[] args) {
        int array [] = {5, 13, 8, 2, 1}; // массив Array, который буду сортировать
        System.out.println("Не отсортированный массив: " + Arrays.toString(array));

        boolean isSortedBubble = false; // флажок: отсортирован ли массив
        int buf; // переменная, которая необходима для обмена

        while (!isSortedBubble){ //нам неизвестно сколько потребуется попарных сравнений (пузырьков), поэтому цикл while
            isSortedBubble = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1] ){ // если элемент массива i больше следующего элемента i+1, то:
                    isSortedBubble = false; // значит  isSortedBubble false

                    // происходит замена элементов
                    buf = array[i];
                    array[i] = array [i+1];
                    array[i+1] = buf;
                    // цикл продолжает выполняться, пока  isSortedBubble не станет true
                }
            }
        }
        System.out.println("Массив, отсортированный пузырьком: " + Arrays.toString(array));
    }
}
