package HomeWork3;

import java.util.Arrays;

public class Ex_5_Quick {

    public static void main(String[] args) {
        int [] a = {8, 98, 76, 80, 7, 5, 22};
        System.out.println("Не отсортированный массив: " + Arrays.toString(a));

        quickSort(a, 0, a.length-1);
        System.out.println("Массив, отсортированный быстрым методом: " + Arrays.toString(a));
    }

    private static void quickSort (int [] arr, int left, int right){
        if (arr.length == 0){
            System.out.println("Массив равен нулю");
            return;
        }

        if (left >= right){
            return;
        }

        int i = left; // правый массив
        int j = right; // левый массив
        int base = arr[(i + j) / 2]; // опорный элемент

        do {
            while (arr[i] < base){ // пока  правый элемент массива меньше опорного
                i++;
            }
            while (arr[j] > base){// пока  левый элемент массива больше опорного
                j--;
            }
            if (i <= j){
                int temp = arr [i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j )
            quickSort(arr, left, j);
        if (i < right)
            quickSort(arr, i, right);
    }
}
