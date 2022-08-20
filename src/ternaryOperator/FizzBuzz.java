package ternaryOperator;

import java.util.Scanner;

public class FizzBuzz {

    /*
    using Scanner enter the number
    - if it is multiplier of 3
        fizz
    - if it is multiplier of 5
        buzz
    - if it is multiplier of 3 and 5
     FizzBuzz
    num%3==0
    num%5==0

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        if (number%3==0){
            if (number%5==0){
                System.out.println("FizzBuzz");
            }else {
                System.out.println("Fizz");
            }
        }else if(number%5==0) {
            System.out.println("Buzz");
        }else {
            System.out.println(number + " is not multiplier of 3 or 5");
        }

       String fizzBuzz =  (number%3==0)?((number%5==0)?"FizzBuzz":"Fizz"):(number%5==0)?"Buzz":number + " is not multiplier of 3 or 5";
        System.out.println(fizzBuzz);



    }
}
