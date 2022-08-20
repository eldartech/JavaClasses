package ternaryOperator;

import java.util.Scanner;

public class TernaryTask {
    /*
    using scanner
    ask user to enter number
    - positive or negative
    - odd or even
    boolean1 ?  boolean2?odd:even  :
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int number = scanner.nextInt();
        String oddOrEven = number>0 ? number%2==0?"Positive - Even":"Positive - Odd":number%2==0?"Negative - Even": "Negative - Odd";
        System.out.println(oddOrEven);
    }


}
