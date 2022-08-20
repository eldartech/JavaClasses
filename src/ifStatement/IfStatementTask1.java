package ifStatement;

import java.util.Scanner;

public class IfStatementTask1 {
    /*Using Scanner:
    - ask user to input number
    - you should print out if that
    number is positive or negative
    Pseudocode:
    Scanner
    Ask user to input
    store the input in double
    if statement
    0<number -> negative
    sout(number is negative);
    if statement
    0>=number -> positive
    sout(number is positive);

    */
    public static void main(String[] args) {
        Scanner inputOfUser=new Scanner(System.in);
        System.out.println("Please enter any number: ");
        double number = inputOfUser.nextDouble();
        if (number<0){
            System.out.println(number+" is negative number.");
        }
        if (number>=0){
            System.out.println(number+" is positive number.");
        }
    }
}
