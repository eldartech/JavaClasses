package switchStatement;

import java.util.Locale;
import java.util.Scanner;

public class SwitchStatementTask1 {
    /*using Scanner
    - ask user to input number 1-7
    - depending on number print out day of the week
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please pick a number");
        int number = input.nextInt();
        if(number<=7){
            String day="";//Wednesday
            switch (number){
                case 1:
                    day="Monday";
                    break;
                case 2:
                    day="Tuesday";
                    break;
                case 3:
                    day="Wednesday";
                    break;
                case 4:
                   day="Thursday";
                    break;
                case 5:
                    day="Friday";
                    break;
                case 6:
                    day="Saturday";
                    break;
                case 7:
                    day="Sunday";

            }
            switch (day.toLowerCase()){
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                    day=day.toLowerCase().replace("m","***");
                    System.out.println(number+ " is "+day+", Weekday");
                    break;
                case "saturday":
                case "sunday":
                    System.out.println(number+ " is "+day+", Weekend");
                    break;
            }

        }else {
            System.out.println("Invalid entry.");
        }

        /*
        identify week days and weekends
        "3 is Wednesday, weekday"
         */
    }
}
