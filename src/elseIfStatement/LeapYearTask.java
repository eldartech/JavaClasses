package elseIfStatement;

import java.util.Scanner;

public class LeapYearTask {
    /*
    using scanner
    - ask user to input a year
    - print out if year is Leap year or not
    - if the year is divided by 4
        - if the year is century(100)
            - if the divided by 400
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year.");
                } else {
                    System.out.println(year + " is not leap year.");
                }
            } else {
                System.out.println(year + " is leap year.");
            }

        } else {

            System.out.println(year + " is not leap year.");
        }


    }


}
