package projects.project5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, input the min number: ");
        int num1= scanner.nextInt();
        System.out.println("Please, input the max number: ");
        int num2=scanner.nextInt();
        int result=0;


        for ( ;num2>num1;num1++) {
            if(num1%2==0 && num1%7==0){
                result=result+num1;
               // System.out.println(result);
            }
        }
        System.out.println(result);





    }
}




/*
Using the scanner asks the user to input the min and max number.
Write a java code that will calculate the sum of numbers between
the range of min and max and those that can only be divided by 2 and 7.
(min and max numbers are included)
Example:
0, 50 -> 14 + 28 + 42 = 84
 */