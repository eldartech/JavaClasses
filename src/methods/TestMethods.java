package methods;


import utilityMethods.NumericMethods;
import utilityMethods.StringMethods;

import java.util.Scanner;

import static utilityMethods.NumericMethods.averageOfNumbers;
import static utilityMethods.NumericMethods.reverseNumber;
import static utilityMethods.StringMethods.isPalindrome;
import static utilityMethods.NumericMethods.isPalindrome;


public class TestMethods {


    public static void main(String[] args) {

        String result = StringMethods.reverseWord("123");
        System.out.println(result);
        System.out.println(StringMethods.reverseWord("i love java"));
        double average = averageOfNumbers(10,3);
        System.out.println(average);
        String str="Home";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("Civic"));

        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Please enter word to check if it is palindrome or not:");
            String word = scanner.next();
//            String reversed = "";
//            for (int i=word.length()-1;i>0;i--){
//                reversed+=reversed.charAt(i);
//            }
//            if (reversed.equalsIgnoreCase(word)){
//                System.out.println("Palindrome: "+true);
//            }else {
//                System.out.println("Palindrome: "+true);
//            }
            System.out.println("Palindrome: "+StringMethods.isPalindrome(word));
            System.out.println("Do you want to continue?");
            answer= scanner.next();
        }while(answer.equalsIgnoreCase("yes"));

        System.out.println(reverseNumber(1234));
        int r=reverseNumber(1972);
        System.out.println(r);

        System.out.println(isPalindrome(r));
    }





}

