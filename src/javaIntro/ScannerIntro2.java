package javaIntro;

import java.util.Scanner;//import the Scanner from java.util
public class ScannerIntro2{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = userInput.next();
        System.out.println("What is your last name?");
        String lastName = userInput.next();
        int ageInput= userInput.nextInt();
        System.out.println("Age is :  "+ ageInput);
    }
}