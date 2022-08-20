/*package projects.project;

import java.util.Scanner;

public class Task3Project {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount of money?");



        double money = input.nextDouble(); //2.36
        double totalCents = (money*100); //236.0
        double quarters = ((int)totalCents/25);//9.0
        double quartersCents = (totalCents-(quarters*25)); // 236-225=11

        int quarters1 = (int)quarters;//9
        System.out.println(totalCents);
        System.out.println(quarters);
        System.out.println(quarters1);
        System.out.println(quartersCents);


        double dimes = (quartersCents%10);
        int dimes1 = (int)dimes;//1
        System.out.println(dimes1);

        double nickels =((totalCents-(quarters*25)-dimes)%5);
        System.out.println(nickels);
        int nickels1 = (int)nickels;//0
        System.out.println(nickels1);
        System.out.println("The total in dollars is $"+ (quarters1);

    }
}
*/