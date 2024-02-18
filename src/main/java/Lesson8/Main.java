package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
        // уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается
        // каждое слово.
        String[] stringArray = {"one", "two", "two", "three", "four", "four", "four", "five", "six", "seven"
                , "eight", "nine", "ten", "ten", "ten", "ten", "eleven", "twelve"};
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        Duplicate.removeDuplicatesAndCountWords(stringList);
        System.out.println("========");

        // Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В
        // этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
        // номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
        // однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Petrov", "12301111111");
        phonebook.add("Ivanov", "12302222222");
        phonebook.add("Sidorov", "12303333333");
        phonebook.add("Petrov", "12304444444");
        phonebook.add("Petrov", "12305555555");

        System.out.println(phonebook);
        System.out.println(phonebook.get("Petrov"));
    }
}
