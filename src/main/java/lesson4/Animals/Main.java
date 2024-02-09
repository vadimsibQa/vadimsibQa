package lesson4.Animals;

public class Main {
    public static void main(String[] args) {
        Dog dogTuzik = new Dog("Тузик");
        dogTuzik.run(400);
        dogTuzik.swim(15);

        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(150);
        catBarsik.swim(10);

        Cat catMurzik = new Cat("Мурзик");
        catMurzik.run(250);
        catMurzik.swim(11);

        Dog.getCount();
        Cat.getCount();
        Animal.getCount();
    }
}
