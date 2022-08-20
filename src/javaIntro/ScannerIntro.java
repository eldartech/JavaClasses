package javaIntro;

import java.util.Scanner;//import the Scanner from java.util

public class ScannerIntro{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your age?");
		int ageInput = userInput.nextInt();
		System.out.println("Age is: " + ageInput); 
		System.out.println("What is your name?");
		String name= userInput.next();
		System.out.println(name+" is not in our system");


	}

}