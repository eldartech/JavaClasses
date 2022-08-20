package ifElseStatement;

import java.util.Scanner;

public class IfElseTask1 {
    public static void main(String[] args) {
        /*
        using Scanner:
        - Ask user to input number
        -Print out if entered number is Even or Odd
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println(num+" is even number.");
        } else if(num%2==1){
            System.out.println(num+" is odd number.");
        }else {
            System.out.println("please enter number");
        }








    }
}
