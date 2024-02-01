package lesson2;

import java.util.Arrays;

// 7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
public class Task7ChangeArraysValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(changeArray()));
    }

    public static int[] changeArray() {
        int[] numArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < 6) {
                numArray[i] *= 2;
            }
        }
        return numArray;
    }
}
