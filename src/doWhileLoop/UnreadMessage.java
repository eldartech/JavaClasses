package doWhileLoop;

import java.util.Scanner;

public class UnreadMessage {
    /*

    Please enter amount of Unread Messages: -
    10
     Please enter amount of Read Messages:  -
    5
    output:
    Reading message...
     9 unread messages
     6 read messages

     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of Unread Messages:");
        int unread = input.nextInt();
        System.out.println("Please enter the amount of Read Messages:");
        int read = input.nextInt();
        do {
            --unread;
            ++read;
            System.out.println("Reading message...");
            System.out.println(unread+" unread messages.");
            System.out.println(read+" read messages.\n");
            Thread.sleep(500);
        }while (unread>0);





    }



}
