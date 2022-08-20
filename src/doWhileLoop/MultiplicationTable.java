package doWhileLoop;

import java.util.Scanner;

public class MultiplicationTable {
    /*3
    3 * 1 = 2
    3 * 2 = 4
    3 * 3 = 6

     */
    public static void main(String[] args) {
        Scanner inu = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = inu.nextInt();
        int num1 = 1;
        do {
            System.out.println(number + " * " + num1 + " = " + number * num1);
            ++num1;//2
        } while (num1 <= 10);
    }
}
