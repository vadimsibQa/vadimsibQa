package lesson2;

import java.util.Arrays;

// 6. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
public class Task6FillEmptyArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray()));
    }

    public static int[] fillArray() {
        int[] numArray = new int[100];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i + 1;
        }
        return numArray;
    }
}
