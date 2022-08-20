package whileLoop;

import java.util.Scanner;

public class WhilePractice2   {

    public static void main(String[] args) {

        // Ask user to give 2 integer numbers
        // find sum of numbers between those two given numbers
        // 9 12 9+10+11+12 =42

        Scanner s = new Scanner(System.in);
        System.out.println("Please provide starting number");
        int starting = s.nextInt();
        System.out.println("Please provide ending number");
        int ending = s.nextInt();
         int sum =0;
         while (starting<=ending){
      // in the last iteration I should put = sign not the plus sign.
      // if it is the last iteration add = sign
      // if not add plus sign
      // Starting can be maximum equal to ending
      // If starting equals to ending, it means this is the last iteration.

       sum+=starting;
       if(starting==ending){
           System.out.print(starting+"=");
       }else {
             System.out.print(starting+"+");}


             starting++;
         }
        System.out.println(sum);
 // I want this output to look like 3+4+5 = 12




    }
}
