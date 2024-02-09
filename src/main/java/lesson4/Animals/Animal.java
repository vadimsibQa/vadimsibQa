package lesson4.Animals;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не
// умеет плавать, собака 10 м.).
//
//4. * Добавить подсчет созданных котов, собак и животных.
public class Animal {
    private final String name;
    private final int maxRunDistance;
    private final int maxSwimDistance;
    private static int count;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public String getName() {
        return name;
    }

    public static void getCount() {
        System.out.println("Общее количество животных = " + count);
    }

    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(getName() + " не может пробежать такую дистанцию. Максимальная дистанция равна " + maxRunDistance + " м.");
        } else {
            System.out.println(getName() + " пробежал " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println(getName() + " не может проплыть такую дистанцию. Максимальная дистанция равна " + maxSwimDistance +
                    " м.");
        } else {
            System.out.println(getName() + " проплыл " + distance + " м.");
        }
    }
}
