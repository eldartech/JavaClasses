package ifElseStatement;

import java.util.Scanner;

public class IfElseIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String expectedPassword="Password123%";
        System.out.println("Please enter password: ");
        String actualPassword=scanner.next();
        //min 8 max 32, contains special characters of $
        if ((actualPassword.length()>=8 && actualPassword.length()<=32)&&
                actualPassword.contains("$")){
            System.out.println("Password met the requirements.");
        }else {
            System.out.println("Password didn't meet the requirements.");
        }

    }
}
