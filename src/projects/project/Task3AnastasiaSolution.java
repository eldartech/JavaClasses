package projects.project;

import java.util.Scanner;

public class Task3AnastasiaSolution {
    public static void main(String[] args) {
        Scanner change = new Scanner(System.in);
        System.out.println("Please enter dollar amount");
        double amount= change.nextDouble();
        int rem=(int)(amount*100); //2.36*100=236
        int numQuarters=rem/25; //236/25=9.....
        rem=rem%25;
        int numDim=rem/10;
        rem=rem%10;
        int numNic=rem/5;
        rem=rem%5;
        int numPen=rem;
        System.out.println(numQuarters);
        System.out.println(numNic);
        System.out.println(numDim);
        System.out.println(numPen);

        System.out.println(amount+ " will make "+numQuarters+" quarters "+numDim+" dimes "+numNic+" nickels "+numPen+ " pennies." );
    }
}