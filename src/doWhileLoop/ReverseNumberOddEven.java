package doWhileLoop;

import java.util.Scanner;

public class ReverseNumberOddEven {
    /*
    reverse number by Odd and Even numbers
    ex: 1234
    output: 31
            42
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        final int num1 = number;
        int reveredEven = 0;
        int reversedOdd = 0;
        do {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                reveredEven = reveredEven * 10 + remainder;
            } else {
                reversedOdd = reversedOdd * 10 + remainder;
            }

            number /= 10;

        } while (number != 0);
        System.out.println(num1);
        System.out.println("Even reversed number " + reveredEven);
        System.out.println("Odd reversed number " + reversedOdd);
    }
}
