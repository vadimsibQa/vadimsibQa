package lesson2;

import java.util.Arrays;

// 9.* Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
// int длиной len, каждая ячейка которого равна initialValue;
//
//*** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
// отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для
// усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
// -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг
// можете выбирать сами.
public class Task9ArrayWithValue {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(8, 99)));
        System.out.println(Arrays.toString(moveArrayIndex(new int[] {1, 2, 3, 4}, -5)));
    }

    public static int[] fillArray(int len, int initialValue) {
        int[] numArray = new int[len];
        Arrays.fill(numArray, initialValue);
        return numArray;
    }

    // Задание со звездочкой
    public static int[] moveArrayIndex(int[] array, int moveIndex) {
        if (moveIndex > 0) {
            for (int i = 0; i < moveIndex; i++) {
                int lastElem = array[array.length - 1];
                for (int j = array.length - 2; j >= 0; j--) {
                    array[j + 1] = array[j];
                }
                array[0] = lastElem;
            }
        }
        if (moveIndex < 0) {
            for (int i = moveIndex; i <= -1 ; i++) {
                int firstElem = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = firstElem;
            }
        }
        return array;
    }
}
