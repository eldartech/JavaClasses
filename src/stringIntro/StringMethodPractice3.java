package stringIntro;

import java.util.Scanner;

public class StringMethodPractice3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        /*
        user to input sentence
        user to input part word
        contains
        endsWith
        startsWith
         */
        System.out.println("Please enter sentence: ");
        String sentence=scanner.nextLine();
        System.out.println("Please enter word: ");
        String word=scanner.next();
        System.out.println(sentence+" contains: "+sentence.contains(word));
        System.out.println(sentence.startsWith(word));
        System.out.println(sentence.endsWith(word));


    }
}
