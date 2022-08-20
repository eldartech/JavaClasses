package stringMethods;

import java.util.Scanner;

public class StringPracticeTask1 {
    /*
    Task:
using Scanner ask user to enter a word
	- print the length of it
	- print the first letter
	- print the last letter
	- print the approximate middle letter
	- use charAt and print the letter
	- use indexOf and print the index
	- concat the String with another String and print

Outcome:
String word = "techtorial";

	Length of techtorial is 10
	First letter of techtorial is t
	Last letter of techtorial is l
	Middle letter of techtorial is o
	Char at index 2 is c
	Index of second t is 4
	I love techtorial

     */

    public static void main(String[] args) {
        System.out.println("Please enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println("Length of "+word+" is "+word.length());
        System.out.println("First letter of "+word+" is "+word.charAt(0));
        System.out.println("Last letter of "+word+" is "+word.charAt(word.length()-1));
        System.out.println("Middle letter of "+word+" is "+word.charAt(word.length()/2)); //10/2=5
        System.out.println("Please enter index: ");
        int index = input.nextInt();
        System.out.println("Char at index "+index+" is "+word.charAt(index));
        System.out.println("Please enter the char: ");
        String letter=input.next();
        System.out.println("Index of letter "+letter+" is "+word.indexOf(letter));
        System.out.println("Please enter second word to concatenate: ");
        input.nextLine();// reading the \n from previous input
        String word2= input.nextLine();
        String concatWords=word.concat(word2);
        System.out.println(concatWords);
        /*
        ask user to enter letter or word from beginning of the concatenated word
        - print out if concatWords starts with entered letter or word
        ask user to enter letter or word from end of the concatenated word
        - print out if concatWords ends with entered letter or word
        - print out if concatWords contains entered letter or word
         */
        System.out.println("Enter letter or word from beginning of the concatenated word: ");
        String wordToCheck=input.next();
        System.out.println(concatWords+" starts with "+wordToCheck+": " +concatWords.startsWith(wordToCheck));
        System.out.println("Enter letter or word from end of the concatenated word: ");
        String wordToCheck2=input.next();
        System.out.println(concatWords+" ends with "+wordToCheck2+": "+concatWords.endsWith(wordToCheck2));
        System.out.println(concatWords+" contains "+wordToCheck2+": "+concatWords.contains(wordToCheck2));
        /*
        ask for one letter to replace from concatenated word(target)
            -"Please enter letter to replace: "
        ask one more letter to replace with (new letter to replace)
            -"Please enter replacement letter: "
        Print out concatenated word with replaced letters

         */
        System.out.println("Please enter letter to replace: ");
        String targetLetter = input.next();
        System.out.println("Please enter replacement letter: ");
        String replacementLetter= input.next();
        System.out.println(concatWords.replace(targetLetter,replacementLetter));


        /*
        Concatenate multiple spaces before and after the concatWords
        print new value for concatWords
        reassign concatWords with trimmed value using trim() method, remove the spaces
        print concatWords
         */
        String spaces = "          ";
        concatWords=spaces+concatWords+spaces;
        System.out.println(concatWords);
        concatWords=concatWords.trim();
        System.out.println(concatWords);


    }
}
