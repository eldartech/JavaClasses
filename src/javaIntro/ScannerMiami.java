package javaIntro;

import java.util.Scanner;

public class ScannerMiami{
	public static void main (String[] argys) {
		Scanner input = new Scanner (System.in);

		System.out.println("What if your first name?");
		String firstName = input.next();
		System.out.println("What if your last name?");
		String lastName = input.next();
		System.out.println("What is your age?");
	
		int ageInput = input.nextInt();
		System.out.println("firstName: "+firstName + "\nlastName: "+ lastName+ "\nAge is: " + ageInput);
		

	}
}