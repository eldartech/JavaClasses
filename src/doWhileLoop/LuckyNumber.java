package doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(10);
        /*
        using scanner ask user a number between 0 and 10
        - if input number matches you will print "Lucky Number"
        - if it is not matched, iterate the question until
        it reaches 3 attempts
        ex:
        2<hidden number
        number is less than hiddenNumber
        please try again
        3
         please try again
         3
         You have used all attempts
         */
        System.out.println(hiddenNumber);
        Scanner input = new Scanner(System.in);
        int guess;
        int count=0;
       do {
           ++count;
           System.out.println("Guess the number:");
           guess=input.nextInt();
           if (guess==hiddenNumber){
               System.out.println("Congratulations, you have guessed correctly.");
               break;
           }else {
              if (count==3){
                  System.out.println("You have used all of your attempts. Lucky number was "+hiddenNumber);
              }else {
                  if (guess>hiddenNumber){
                      System.out.println("Your number is more than hidden number.");
                      System.out.println("Use your attempt #"+(count+1));
                  }else {
                      System.out.println("Your number is less than hidden number.");
                      System.out.println("Use your attempt #"+(count+1));
                  }

              }
           }

       }while(count<3);

    }
}
