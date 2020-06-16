package HomeWork3;

import java.util.Arrays;

// 2.b. Сортировка массива шейкером

public class Ex_2_Shake {
    public static void main(String[] args) {

        // Объявление и инициализация массива

        int array [] = {5, 13, 8, 2, 1};
        System.out.println("Не отсортированный массив: " + Arrays.toString(array));

        // Сортировка массива шейкером

        int leftSide = 0;
        int rightSight = array.length - 1;
        int temp;

        do {
            for (int i = leftSide; i < rightSight; i++) {

                // Сортировка справа налево и поиск МАХ значения
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

            rightSight--; // Уменьшение количества проходов

            // Сортировка слева направо и поиск МIN значения
            for (int i = rightSight; i > leftSide; i--){
                if (array[i] < array[i - 1]){
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }

            /*
             Уменьшаем количество проходов.
             Мы шли с конца исходя из условия последнего for.
             Что бы уменьшить кол-во проходок --
             нужно инкрементировать счётчик
             */
            leftSide++;



        } while (leftSide < rightSight); //Наше условие, при котором буду происходить проходки

        System.out.println("Массив, отсортированный шейкером: " + Arrays.toString(array));
    }
}
