package stringMethods;

import java.util.Scanner;

public class StringMethodTask2 {
    /*
    Using Scanner:
    - ask user to input 2 words and store it into 1 String
    - separate the words into 2
    - print out words
    - print out the length of 1st word and 2nd word

    "Hello World"
    "Hello"
    "World"
    5
    5
     */
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter 2 words: ");
        String words= scannerInput.nextLine();
        String word1= words.substring(0,words.indexOf(" "));
        String word2= words.substring(words.indexOf(" ")+1);
        System.out.println(word1+" has length of: "+word1.length());
        System.out.println(word2+" has length of: "+word2.length());

    }


}
