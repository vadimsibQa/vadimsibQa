package lesson4.Plate;

public class Cat {
    private final String name;
    private int appetite;
//  Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
    private boolean isFull;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate p) {
        // Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске
        // 10 еды, а кот пытается покушать 15-20).
        // Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину
        // сыт (это сделано для упрощения логики программы).
        if (p.getFood() < appetite) {
            System.out.println("В миске недостаточно еды, чтобы кот наелся =(");
        } else {
            p.decreaseFood(appetite);
            isFull = true;
        }
    }
}
