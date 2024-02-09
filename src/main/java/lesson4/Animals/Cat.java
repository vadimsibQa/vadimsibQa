package lesson4.Animals;

public class Cat extends Animal{

    private static int count;

    public Cat(String name) {
        super(name, 200, 0);
        count++;
    }

    // Переопределил метод swim для класса Cat так как по условию коты не умеют плавать. Можно было и в родительском
    // сделать доп проверку если maxSwimDistance == 0 то выбить сообщение оттуда.
    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать.");
    }

    public static void getCount() {
        System.out.println("Количество котов = " + count);
    }
}
