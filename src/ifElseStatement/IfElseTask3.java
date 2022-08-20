package ifElseStatement;

import java.util.Scanner;

public class IfElseTask3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your score for exam 1:");
        int exam1=scanner.nextInt();
        System.out.println("Please enter your score for exam 2:");
        int exam2=scanner.nextInt();
        System.out.println("Please enter your score for exam 3:");
        int exam3=scanner.nextInt();

        int average =(exam1+exam2+exam3)/3;
        if (average>=70){
            System.out.println("You have passed the class. Your score is: "+average);
        }else{
            System.out.println("You have failed the class. Your score is: "+average);
        }



    }
}
