package lesson2;

import java.util.Scanner;

// 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
public class Task2IsPositive {
    public static void main(String[] args) {
        System.out.println("Введите число, чтобы определить положительное оно или отрицательное");
        int inputNumber = new Scanner(System.in).nextInt();
        System.out.println(isPositive(inputNumber));
    }

    public static String isPositive(int num) {
        if (num >= 0) {
            return "Число положительное";
        }
        return  "Число отрицательное";
    }
}
