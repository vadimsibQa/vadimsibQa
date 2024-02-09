package lesson4.Payment;

import java.util.Arrays;


// Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Payment {
    Product[] products = new Product[4];
    // Наверное можно сделать как-то через arrayList с дженерик типом и методом add, но пока не все темы еще
    // прошли и наверное нужно делать дз учитывая пройденные темы, поэтому приходится создавать массив с заранее
    // объявленной длиной и использовать переменную для доступа к индексу.
    int counter;

    public void showProducts() {
        System.out.println(Arrays.toString(products));
    }

    public void addProduct(String name, double price) {
        products[counter] = new Product(name, price);
        counter++;
    }

    private class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }


        @Override
        public String toString() {
            return "Product: " + name + ", price: " + price;
        }
    }
}
