package stringIntro;


import java.util.Scanner;

public class StringMethodPractice2 {
    public static void main(String[] args) {
        String upperCaseWord="WORLD";
        System.out.println(upperCaseWord.toLowerCase());
        String lowerCaseWord="techtorial";
        System.out.println(lowerCaseWord.toUpperCase());
        System.out.println("===========================");
        //startWith("")==> true/false (boolean)
        boolean isStartsWith=lowerCaseWord.startsWith("tec");
        System.out.println(isStartsWith);
        //endsWith("") ==> true/false (boolean)
        String str1 = "Hello World";
        System.out.println(str1.endsWith("World"));
        boolean isEndsWith=str1.endsWith(" World");
        System.out.println(isEndsWith);
        //contains() ==> true/false (boolean)
        String str2 = "I love Java";
        boolean isContains=str2.contains("love");
        System.out.println(isContains);





    }
}
