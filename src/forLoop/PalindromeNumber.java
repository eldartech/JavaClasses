package forLoop;

import java.util.Scanner;

public class PalindromeNumber {
    /*
    Palindrome Number
    ask user to enter number
    - print out if that number is palindrome or not
    input: 3553
    output: 3553 is palindrome

    input: 123
    output 123 is not palindrome
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number, reverseNumber;
        number = scanner.nextInt();
        final int n = number;
        reverseNumber = 0;
        for (int i=0; number != i; number /= 10) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;


        }
        System.out.println(reverseNumber);
        String palindrome = (n == reverseNumber) ? n + " is palindrome" : n + " is not palindrome";
        System.out.println(palindrome);

    }
}
