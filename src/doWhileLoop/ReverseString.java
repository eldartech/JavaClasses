package doWhileLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scanner.next();
        //test => tset
        int index = word.length()-1;
        String reversedWord = "";//tset
        do {
           reversedWord+=word.charAt(index);
           // reversedWord=reversedWord+word.charAt(index); ""+t+s+e+t
           index--;//0
        }while(index>=0);//0
        //tset.toUpperCase

        System.out.println(reversedWord.replace(""+reversedWord.charAt(0),"*").toUpperCase().concat(" is a academy."));

    }
}
