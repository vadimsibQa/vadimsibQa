package lesson4.Plate;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        //В условиях задачи есть проверка, что значение не может быть отрцительным - но это и так регулируется из класса Cat
        food -= amount;
    }

    //  Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
}
