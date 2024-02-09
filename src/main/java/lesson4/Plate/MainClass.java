package lesson4.Plate;

public class MainClass {
    public static void main(String[] args) {
//      Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] catArray = new Cat[4];
        catArray[0] = new Cat("Cat1", 10);
        catArray[1] = new Cat("Cat2", 15);
        catArray[2] = new Cat("Cat3", 5);
        catArray[3] = new Cat("Cat 4", 10);

        Plate plateForArray = new Plate(100);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plateForArray);
            // Вывел инфу о сытости в консоль прямо из цикла, но можно и отдельным вызовом сделать
            if (catArray[i].isFull()) {
                System.out.println(catArray[i].getName() + " сыт");
            } else {
                System.out.println(catArray[i].getName() + " голоден");
            }
        }

        plateForArray.info();
    }
}
