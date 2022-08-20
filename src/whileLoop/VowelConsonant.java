package whileLoop;

import java.util.Scanner;

public class VowelConsonant {
    /*scanner ask user to enter a word
    - print out if each letter of word is vowel or consonant

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = scanner.next().toLowerCase();
        int i = 0;
        while (i<word.length()){
            char letter = word.charAt(i);
            if (letter=='a'||letter=='o'||letter=='e'||letter=='i'||letter=='u'){
                System.out.println(letter+" is vowel.");
            }else {
                System.out.println(letter+" is consonant.");
            }
            i++;
        }
    }
}
