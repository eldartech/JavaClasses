package elseIfStatement;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        using scanner
        - ask patients name: Jennifer
        - ask patients lastname: Yu

        - print out username for the login by combining
        first 3 letters of first name and last 3 letters of
        lastname
        - if the amount of letters less than 3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first name:");
        String firstName = input.next();
        System.out.println("Please input your last name:");
        String lastName = input.next();
        String userName="";
        if (firstName.length()>=3 && lastName.length()>=3){
            userName=firstName.substring(0,3).concat(lastName.substring(lastName.length()-3));
        }else {
            if (firstName.length()<3){
                if (lastName.length()<3){
                    userName=firstName+lastName;
                }else {
                    userName=firstName+lastName.substring(lastName.length()-3);
                }
            }else {
                if (lastName.length() < 3) {
                    userName=firstName.substring(0,3)+lastName;
                }
            }
        }

        System.out.println(userName);


    }
}
