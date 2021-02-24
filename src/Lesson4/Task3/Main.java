package Lesson4.Task3;


public class Main {

    static String changeStr(StringReverse sf, String s){
        return sf.reverse(s);
    }


    public static void main(String[] args) {

        String inStr = "java interview";
        String outStr;

        System.out.println("Входная строка: " + inStr);

        StringReverse reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;

        };

        outStr = changeStr(reverse, inStr);
        System.out.println(outStr);
    }
}


//3 Напишите метод, переворачивающий строку.
//Например, «java interview» превращается в «weivretni avaj».

