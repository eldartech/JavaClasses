package doWhileLoop;

import java.util.Scanner;

public class PowerOfNumber {
    /*
    ask user to input base number
    ask user to input power number
    you should print calculated amount
    2
    4
    2*2*2*2
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input base number:");
        int base = input.nextInt();
        System.out.println("Please input power number:");
        int power = input.nextInt();
        final int num = power;
        int result = 1;

        do {
            result *= base;
            power--;
        } while (power > 0);
        System.out.println(base + " to the power of " + num + " is " + result);
    }


}
