package Lesson4.Task4;

public class Main {

    public static void main(String[] args) {

        Integer[] list = new Integer[] {1,2,3,4,5};

        FindMaximum fm = (Integer[] x) -> {
            int max = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] > max) {
                    max = list[i];
                }
            }
            return max;
        };

        int biggestNumber = fm.maximum(list);


        System.out.println("Наибольшее чилсло: " + biggestNumber);
    }

}
//4 Напишите метод, который возвращает наибольшее целое число в списке.
//  public int maxValue(int array[]){
