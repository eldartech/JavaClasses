package elseIfStatement;

import java.util.Scanner;

public class ElseIfIntro {
    public static void main(String[] args) {
        Scanner  user=new Scanner(System.in);
        System.out.println("What time is it?");
        int hourOfDay=user.nextInt();
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

    }
}
