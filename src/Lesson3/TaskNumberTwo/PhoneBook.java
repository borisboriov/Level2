package Lesson3.TaskNumberTwo;


import java.util.*;

public class PhoneBook {

    private HashMap<String, List<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }


    public void add(String name, String number) {
        if (book.containsKey(name)) {
            List<String> numbers = book.get(name);
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        } else {
            book.put(name, new ArrayList<>(Collections.singletonList(number)));
        }
    }


    public void get(String name) {
        List<String> flag;
        if (book.containsKey(name)) {
            flag = book.get(name);
            System.out.println("Есть такое: " + name + " " + flag);
        } else {
            System.out.println("Такого имени в справочнике нет");
        }
    }


    public void info() {
        System.out.println(book);
    }


}


