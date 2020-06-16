package HomeWork3;

import java.util.Arrays;
import java.util.Random;

public class Ex_4_Merger {
    private int[] a;
    private int[] b;

    public static void main(String[] args) {
        Ex_4_Merger ex_4_merger = new Ex_4_Merger();
        int [] a = {2, 5, 96, 34, 75, 21, 99};
        int [] b = ex_4_merger.sortArray(a);
        System.out.println("Не отсортированный массив: " + Arrays.toString(a));
        System.out.println("Массив, отсортированный слиянием: " + Arrays.toString(b));
    }
    private int[] sortArray(int[] arr) {
        // Проверяем не является ли массив нулевым
        if (arr == null){
            System.out.println("Массив равен нулю");
            return null;
        }

        // Проверяем не состоит ли массив из 1 элемента
        if (arr.length < 2){
            return arr; // возврат в рекурсию
        }

        // Определяем длину массива слева: от начала до середины
        int [] left = new int[arr.length / 2];
        // Копируем из нулевой позиции массив left и вставляем в нулевую позицию по размеру всего массива left
        System.arraycopy(arr, 0, left, 0, arr.length/2 );

        // Определяем длину массива справа: от середины до конца
        int [] right = new int[arr.length - arr.length / 2];
        // Копируем массив righ из позиции на которой закончился предыдущий массив и вставляем в нулевую позицию по размеру всего массива right
        System.arraycopy(arr, arr.length/2, right, 0, arr.length - arr.length/2);

        //вызываем рекрусивно метод и в качестве параметров используем массивы left и right
        left = sortArray(left);
        right = sortArray(right);

        // операция слияния отсортированных массивов
        return mergeArray (left, right);
    }
    private int[] mergeArray(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        int[] res = new int[a.length + b.length]; // результирующий массив res
        int n = a.length; // длина 1-го массива
        int m = b.length; // длина 2-го массива
        int i=0; // счетчик 1-го массива
        int j=0; // счетчик 2-го массива
        int k = 0; // счетчик результирующего массива
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res [k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n){
            res[k] = a[i];
            k++;
            i++;
        }
        while (j < m){
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
}
