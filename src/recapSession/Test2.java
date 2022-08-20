package recapSession;

import java.util.Scanner;

public class Test2 {

        public static void main (String[] argys ){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your age?");
            int age = scanner.nextInt();
            if (age<18){// 18 --> true
                System.out.println("Do you have some one older than you to escort you to the building? (Yes/No)");
                String answer1= scanner.next();
                if (answer1.equalsIgnoreCase("yes")){
                    System.out.println("What is his/her age?");
                    int age2=scanner.nextInt();
                    if (age2>=18){
                        System.out.println("You can enter the building.");
                    }else {
                        System.out.println("You can not enter the building");
                    }
                } else {
                    System.out.println("You can not enter the building");
                }

            } else {
                System.out.println("You can enter the building.");

            }



        }
    }
