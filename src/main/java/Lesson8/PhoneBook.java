package Lesson8;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        ArrayList<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
            phones.add(number);
            phoneBook.put(name, phones);
        } else {
            phones.add(number);
        }
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    @Override
    public String toString() {
        return "Phone numbers:" +
                " " + phoneBook +
                ' ';
    }
}
