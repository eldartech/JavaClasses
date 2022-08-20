package doWhileLoop;

import java.util.Scanner;

public class ReverseNumber {
    /* user inputs number
    print revered number
    for ex: 1234
    output:
    31
    42

     */

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        final int num1= number;
        int reversedNumber = 0;//3*10=30+2*10+1
        int multiplication=1;
        int sumOfDigits = 0;
        do {
            int remainder = number%10;
            reversedNumber = reversedNumber*10+remainder;
            number/=10;
            multiplication*=remainder;
            sumOfDigits+=remainder;


        }while (number!=0);
        System.out.println(num1);
        System.out.println("Reversed number "+reversedNumber);
        System.out.println("Multiplication of digits: "+multiplication);
        System.out.println("Sum of digits: "+sumOfDigits);
    }
}
