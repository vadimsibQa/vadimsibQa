package lesson2;

import java.util.Scanner;

// 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
// (включительно), если да – вернуть true, в противном случае – false.
public class Task1SumRangeChecker {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int numInput1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int numInput2 = new Scanner(System.in).nextInt();
        System.out.println(checkRange(numInput1, numInput2));
    }

    public static boolean checkRange(int num1, int num2) {
        int sum = num1 + num2;

        return sum >= 10 && sum <= 20;
    }
}
