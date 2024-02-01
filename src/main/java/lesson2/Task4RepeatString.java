package lesson2;

import java.util.Scanner;

// 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
// указанную строку, указанное количество раз;
//
//* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
// високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Task4RepeatString {
    public static void main(String[] args) {
        System.out.println("Введите строку, которую нужно будет повторить");
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println("Введите какое кол-во раз нужно повторить строку");
        int num = new Scanner(System.in).nextInt();
        repeatString(inputStr, num);

        System.out.println("Введите номер года, чтобы определить високосный год или нет");
        int year = new Scanner(System.in).nextInt();
        System.out.println(isLeapYear(year));
    }

    public static void repeatString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    // *
    //  год, номер которого кратен 400, — високосный;
    //  остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
    //  остальные годы, номер которых кратен 4, — високосные[5];
    //  все остальные годы — невисокосные.годы
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
