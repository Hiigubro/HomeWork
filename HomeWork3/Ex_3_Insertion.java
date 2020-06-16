package HomeWork3;

import java.util.Arrays;

public class Ex_3_Insertion {
    public static void main(String[] args) {

        // Объявление и инициализация массива
        int array[] = {5, 13, 8, 2, 1};
        System.out.println("Не отсортированный массив: " + Arrays.toString(array));

        // Сортировка массива включением
        for (int left = 0; left < array.length; left++) {

            // Вынимаем значение элемента
            int value = array[left];

            /*
             Проходимся по элементам
             которые стоят до вынимаемого значения элемент
             */
            int i = left - 1;
            for (; i >= 0; i--) {
                /*
                Если вынимаем значение меньшее —
                передвигаем больший элемент дальше
                 */
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    /*
                Если вынимаем значение большее —
                останавливаемся
                 */
                    break;
                }
            }
            /*
             В освободившееся место вставляем
             значение, которое вынимали
             */
            array[i + 1] = value;
        }
        System.out.println("Массив, отсортированный включением: " + Arrays.toString(array));
    }
}

