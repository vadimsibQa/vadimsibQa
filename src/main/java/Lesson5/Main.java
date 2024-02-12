package Lesson5;

public class Main {
    public static void main(String[] args) {
        // Создаем пару фруктов и проверяем
        Orange orange1 = new Orange();
        Apple apple1 = new Apple();

        System.out.println(orange1.getWeight());
        System.out.println(apple1.getWeight());

        // Создаем 2 коробки, проверяем изначальное сосотояние, затем добавляем фрукты
        Box<Orange> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        box1.checkBoxState();
        box1.getWeight();

        box1.addFruit(orange1);
        box2.addFruit(apple1);
        box2.addFruit(apple1);

        box1.checkBoxState();
        System.out.println(box1.getWeight());

        box2.checkBoxState();
        System.out.println(box2.getWeight());

        // Проверяем метод сравнения
        System.out.println(box1.compare(box2));

        // Создаем еще одну коробку и пересыпаем
        Box<Orange> box3 = new Box<>();
        box3.addFruit(orange1);
        box1.moveToOtherBox(box3);
        box1.checkBoxState();
        box3.checkBoxState();
    }
}
