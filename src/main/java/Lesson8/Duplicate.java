package Lesson8;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public static void removeDuplicatesAndCountWords (List<String> stringList) {
        System.out.println("Изначальный массив:");
        System.out.println(stringList);
        Set<String> stringSet = new LinkedHashSet<>(stringList);
        System.out.println("Массив с уникальными значениями:");
        System.out.println(stringSet);
        for (String word : stringSet) {
            System.out.println("Слово " + word + " : " + Collections.frequency(stringList, word) + " раз(а)");
        }
    }
}
