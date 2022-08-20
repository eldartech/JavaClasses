package forLoop;

import java.util.Scanner;

public class Palindrome {
    /*
  A string is called a palindrome string if the reverse of that
  string is the same as the original string.
   For example, radar, level, CIVIC etc.
    -ask user to input a word
    - identify if it is palindrome or not
    pseudocode:
        - reverse word
        - compare word1 with word2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = scanner.next();
        String reversedWord = "";
        for (int i = word.length()-1;i>=0;i--){
            reversedWord+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversedWord)){
            System.out.println(word+ " is palindrome.");
        }else {
            System.out.println(word+ " is not palindrome.");
        }

    }

}
