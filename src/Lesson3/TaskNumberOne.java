package Lesson3;

import com.sun.codemodel.internal.JForEach;

import java.util.*;

public class TaskNumberOne {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("duck");
        words.add("cow");
        words.add("pig");
        words.add("chicken");
        words.add("rat");
        words.add("turkey");
        words.add("goat");
        words.add("goose");
        words.add("rooster");
        words.add("horse");
        words.add("cat");
        words.add("dog");
        words.add("duck");
        words.add("cow");


        Set<String> unique = new HashSet<>(words);



        System.out.println("Первоначальный массив слов: " + words);
        System.out.println("Массив уникальных слов:" +  unique);
        for ( String word : words) {System.out.println("Слово " + word + " встречается: "  + Collections.frequency(words, word)+" раза."); }
    }

}

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.


