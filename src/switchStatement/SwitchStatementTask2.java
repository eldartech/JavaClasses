package switchStatement;

import java.util.Scanner;

public class SwitchStatementTask2 {
    /*
    using scanner
    - ask user to enter name of month
    - print out amount of days from Jan 1st till inputted month
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of the month: ");
        String month = scanner.next();
        System.out.println("Please enter the year: ");
        int year=scanner.nextInt();
        int totalDays=0;
        switch (month){
            case "December":
                totalDays+=31;
            case "November":
                totalDays+=30;
            case "October":
                totalDays+=31;
            case "September":
                totalDays+=30;
            case "August":
                totalDays+=31;
            case "July":
                totalDays+=30;
            case "June":
                totalDays+=31;
            case "May":
                totalDays+=30;
            case "April":
                totalDays+=31;
            case "March":
                totalDays+=30;
            case "February"://leap
                /*
                4 and if it is century it should be divisible of 400
                 */

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            totalDays+=29;
                        } else {
                            totalDays+=28;
                        }
                    } else {
                        totalDays+=29;
                    }

                } else {
                    totalDays+=28;
                }

            case "January":
                totalDays+=31;
        }
        System.out.println("From January to "+month+": "+totalDays+" days.");
    }
}
