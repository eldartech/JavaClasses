package javaIntro;

import java.util.Scanner;//import the Scanner from java.util
public class ScannerIntro3{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String lastName = userInput.next();
        System.out.println("What is your last name?");
        String lastNeme= userInput.next();
        userInput.nextLine();
        String str1=userInput.nextLine();
        System.out.println(str1);

    }
}