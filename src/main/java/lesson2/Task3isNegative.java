package lesson2;

import java.util.Scanner;

// 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
// отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
public class Task3isNegative {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки отрицательное ли оно");
        int inputNum = new Scanner(System.in).nextInt();
        System.out.println(isNegative(inputNum));
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

}
