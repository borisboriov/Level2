package Lesson3.TaskNumberTwo;


import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();


        System.out.println("________________________");
        System.out.println("Заполняем справочник");
        phoneBook.add("Katya", "6587877");
        phoneBook.add("Katya", "0987654");
        phoneBook.add("Katya", "3232");
        phoneBook.add("Kuzya", "2312312");
        phoneBook.add("Vasya", "1212212");
        phoneBook.add("Petya", "2323232");
        phoneBook.add("Vanya", "22222222");
        phoneBook.add("Sasha", "1234567");
        phoneBook.info();
        System.out.println("________________________");

        System.out.println("Смотрим несуществующее имя: Sidor");
        phoneBook.get("Sidor");
        System.out.println("________________________");
        System.out.println("Смотрим имя, которое есть: Vasya");
        phoneBook.get("Vasya");
        System.out.println("________________________");
        System.out.println("Смотрим имя, c несколькими номерами: Katya");
        phoneBook.get("Katya");
    }

}
