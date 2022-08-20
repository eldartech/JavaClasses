package whileLoop;

import java.util.Scanner;

public class ContainsUppercaseLowercase {
    /*
    - input of 1 word from user
    - count amount of LowerCase
    letters and Uppercase letters
    input: word
    word contains 4 lowercase letters
    word contains 0 Uppercase letters
    ex: Java
    Java contains 3 lowercase letter(s)
    Java contains 1 Uppercase letter(s)
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = input.next();
        int x = 0;
        int length = word.length();
        int countUpperCase=0;
        int countLowerCase=0;

        while (x<length){
            if (word.charAt(x)>='A' && word.charAt(x)<='Z'){
                ++countUpperCase;

            }else {
                ++countLowerCase;

            }
            x++;//1
        }

        System.out.println(word+" contains "+countUpperCase+" uppercase letters.");
        System.out.println(word+" contains "+countLowerCase+" lowercase letters.");


    }

}
