package whileLoop;

import java.util.Random;
import java.util.Scanner;

public class TailHead {

    /*
    Please create a head&tail game(flipping coin) with following rules
    At the beginning print game is started, make a guess HEAD/TAIL.
    So get user's guess as HEAD/TAIL.
    Compare your user's guess with your random number 0/1. --->
    if guess is correct, print "It is your lucky day."
    If not, print "Sorry, your guess wasn't correct."
    At the end ask user "Do you want to play again? Y/N?"
    if the answer is Y, keep playing
    //If the answer is N print "It's ok see you next time"

     */
    public static void main(String[] args) {
        Random random = new Random();

        // If random gives us 1 -> tail
        // ""  ""      ""   "" 0-> head
        //random.nextInt(2); // in this case maximum number I get would be 1.
        Scanner s = new Scanner(System.in);
        System.out.println("GAME IS STARTED");
        String answer = "N";
        do {
            System.out.println("Make a guess HEAD/TAIL");
            String guess = s.next();

            String flipResult = random.nextInt(2) == 0 ? "HEAD" : "TAIL";

            if (guess.equalsIgnoreCase(flipResult)) {
                System.out.println("It is your lucky day.");
            } else {
                System.out.println("Sorry, your guess wasn't correct.");
            }

            System.out.println("Do you want to play again ? Y/N?");
            answer = s.next();
        }while (answer.equalsIgnoreCase("y"));

        System.out.println("It is ok, see you next time.");


    }
}
