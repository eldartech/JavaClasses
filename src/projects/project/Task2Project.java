package projects.project;

import java.util.Scanner;

public class Task2Project {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many quarters do you have?");
        int quarters = input.nextInt();
        System.out.println("How many dimes do you have?");
        int dimes = input.nextInt();
        System.out.println("How many nickels do you have?");
        int nickels = input.nextInt();
        System.out.println("How many pennies do you have?");
        int pennies = input.nextInt();

       System.out.println("The total in dollars is $"+ (quarters*.25+dimes*.1+nickels*.05+pennies*0.01));

    }
}


//Write program will add up the value of a number of quarters, dimes, nickels, and pennies. The number of each type of coin is input by the user. The total value is printed in dollars.
//Example:
//Quarters: 5
//Dimes: 4
//Nickels: 3
//Pennies: 2
//The total in dollars is $1.82