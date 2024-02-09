package lesson4.Animals;

public class Dog extends Animal{

    private static int count;

    public Dog(String name) {
        super(name, 500, 10);
        count++;
    }

    public static void getCount() {
        System.out.println("Количество собак = " + count);
    }
}
