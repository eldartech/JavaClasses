package forLoop;

import java.util.Scanner;

public class Factorial {

    // Write a program to find factorial of the number provided by user.

    // 2 -> 1*2
    // 3 -> 1*2*3
    // 4 -> 1*2*3*4
    // ....
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please provide the number that you want learn its " +
                "factorial");
        int number = s.nextInt();

        int result = 1;
        for (int m = 1; m <=number ; m++) {
            result*=m;
        }

        System.out.println(result);






    }













}
