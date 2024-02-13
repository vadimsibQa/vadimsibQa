package lesson3;

public class Main {
    // Чтобы смотрелось лаконичнее сделал отдельную функцию для вызова из main
    public static void main(String[] args) {
        printListByAge(40);
    }

    private static void printListByAge(int age) {
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+3751234567", 35000.5, 51);
        empArray[1] = new Employee("Sidorov Petr", "QA", "sidorov@mailbox.com", "+3801234567", 30000, 43);
        empArray[2] = new Employee("Petrov Sergey", "Project Manager", "pretrov@mailbox.com", "1-121-123456", 30000,
                40);
        empArray[3] = new Employee("Smirnov Dmitriy", "Business Analyst", "smirnov@mailbox.com", "+7(919)2345678",
                30000,
                28);
        empArray[4] = new Employee("Popov Vasiliy", "DevOps", "popov@mailbox.com", "+79191234567", 30000, 35);

        print("Сотрудники старше " + age + " лет:");

        for (Employee employee : empArray) {
            // В условиях сказано больше 40, думаю это означает 41, 42 и тд.. но технически можно сделать и условие >=
            // как пример банальная проверка "страрше 18" подразумевает что человеку от 18 и более
            if (employee.getAge() > age) {
                print("==============");
                employee.getInfo();
                print("============== \n");
            }
        }
    }

    // Вспомогательный методы для вывода строки
    public static void print(String str) {
        System.out.println(str);
    }
}
