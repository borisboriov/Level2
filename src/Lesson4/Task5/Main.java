package Lesson4.Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        FindAverage fa = (List<Integer> xx) -> {
            int count = 0;
            for (int i = 0; i < list.size() +1; i++) {
                count += i;
            }
            return (double) count / list.size();
        };


        System.out.println("Среднее значение списка чисел: " + fa.average(list));

    }
}

//5. Напишите метод, который возвращает среднее значение из списка целых чисел.
//public Double average(List<Integer> list)
