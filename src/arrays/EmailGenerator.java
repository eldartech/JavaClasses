package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmailGenerator {
    /*
    using Scanner ask user to input 10 names
    store names in to array
    generate company email by using names provided by user
    store the generated emails into array and print out
    ex: [Anna,John, Bob]
    a.anna@techtorial.com, c.john@techtorial.com
     */
    public static void main(String[] args) {

        String [] emails = new String[5];
//0 ->Anna, 1->Bob
        String emailSuffix="@techtorail.com";
        for (int i = 0; i < emails.length ; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("firstname?");
           String firstName =  userInput.next().toLowerCase();
            System.out.println("lastname?");
            String lastName = userInput.next().toLowerCase();
            emails [i] = lastName.charAt(0)+"."+firstName.concat(emailSuffix);

        }
        Arrays.sort(emails);
        for (String email:emails) {
            System.out.println(email);
        }



    }
}
