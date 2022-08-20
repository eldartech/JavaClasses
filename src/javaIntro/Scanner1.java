package javaIntro;

import java.util.Scanner;
public class Scanner1{
    public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.println("What country is this?");
    String country = input.next();
    System.out.println("The country is "+ country);
    System.out.println("What year is this?");
    int yearInput= input.nextInt();
    System.out.println(yearInput+" Do you live under a rock?");
    }
}