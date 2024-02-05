package lesson3;

import static lesson3.Main.print;

public class Employee {

    public Employee(String fullName, String jobPosition, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // В условиях ничего не сказано, но мне кажется что поля должны быть приватными и если нужно что-то изменять то
    // делать это посредством гетеров и сетеров
    private String fullName;
    private String jobPosition;
    private String email;
    private String phone;
    private double salary;
    private int age;

    // Геттер для получения значения поля возраста
    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        print("ФИО: " + this.fullName);
        print("Должность: " + this.jobPosition);
        print("Почта: " + this.email);
        print("Телефон: " + this.phone);
        print("Зарплата: " + this.salary);
        print("Возраст: " + this.age);
    }
}
