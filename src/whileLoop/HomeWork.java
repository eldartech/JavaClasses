package whileLoop;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = input.next();
        int x = 0;
        int length = word.length();
        int countUpperCase = 0;
        int countLowerCase = 0;

        while (x < length) {
            if (word.charAt(x) >= 'A' && word.charAt(x) <= 'Z') {
                ++countUpperCase;
            } else {
                ++countLowerCase;
            }
            x++;//1
        }
        if (countLowerCase > 0 && countUpperCase > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
