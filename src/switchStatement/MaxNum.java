package switchStatement;

import java.util.Scanner;

public class MaxNum {
    /*
    user inputs 3 nums
    - print out the greatest number
    for ex:
    1
    2
    3
    out:
    3
    task 2:
    for the greatest number print out if it is positive/negative number
    print if it is even or  odd
    task 3:
    - add condition for 0
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1st number:");
        int firstNum = input.nextInt();
        System.out.println("Please enter 2nd number:");
        int secondNum = input.nextInt();
        System.out.println("Please enter 3rd number:");
        int thirdNum = input.nextInt();
        int greatestNum;
        if (firstNum>=secondNum && firstNum>=thirdNum){
            greatestNum=firstNum;
        }else if (secondNum>=firstNum && secondNum>=thirdNum){
            greatestNum=secondNum;
        }else {
            greatestNum=thirdNum;
        }
        System.out.println(greatestNum+" is largest number.");
        if (greatestNum>0){
            System.out.println(greatestNum+" is positive number.");
        }else {
            System.out.println(greatestNum+" is negative number.");
        }
        if (greatestNum%2==0){
            System.out.println(greatestNum+" is even number.");
        }else {
            System.out.println(greatestNum+" is odd number.");
        }


    }
}
