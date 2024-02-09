package lesson4.Park;

import java.util.Arrays;

// Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.
public class Park {
    Attraction[] attractions = new Attraction[4];
    // То же самое, что в методе Payment, наверное грамотно это сделать через arrayList и метода add, но данные темы
    // не пройдены еще и приходится создавать массив с заранее объявленной длинной
    int counter;

    public void showAttractionsInfo() {
        System.out.println(Arrays.toString(attractions));
    }

    public void addAttraction(String name, String time, int price) {
        attractions[counter] = new Attraction(name, time, price);
        counter++;
    }

    private class Attraction {
        private final String name;
        private final String time;
        private final int price;

        public Attraction(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }


        @Override
        public String toString() {
            return "Attraction: " +
                    "{name: " + name +
                    ", working time: " + time +
                    ", price: " + price +
                    '}';
        }
    }
}
