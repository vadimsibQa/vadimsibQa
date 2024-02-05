package lesson2;

import java.util.Arrays;

//5. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
// цикла и условия заменить 0 на 1, 1 на 0;
public class Task5ChangeValues {
    public static void main(String[] args) {
        System.out.println("Новый массив после изменения: " + Arrays.toString(changeValues()));
    }

    public static int[] changeValues() {
        int[] numArray = {1, 0, 1, 1, 0, 0, 1, 1, 1};
        System.out.println("Старый массив: " + Arrays.toString(numArray));
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == 0) {
                numArray[i] = 1;
            } else {
                numArray[i] = 0;
            }
        }
        return numArray;
    }
}
