package elseIfStatement;

import java.util.Scanner;

public class ElseifTask1 {

    /*
    ask user to enter scores for last 3 exams
    get the average of 3 scores
    if it is more than or equal  90 = A
    if it is more than or equal 80  = B
    if it is more than or equal 70 = C
    if it is more than or equal 60 = D
    if it is less than 60 = F
     */
    public static void main(String[] args) {
        Scanner user2=new Scanner(System.in);
        System.out.println("Please enter score for exam 1:");
        int exam1=user2.nextInt();
        if (exam1>100){
            System.out.println("Please enter score between 0-100");
            exam1=user2.nextInt();
        }
        System.out.println("Please enter score for exam 2:");
        int exam2=user2.nextInt();
        if (exam2>100){
            System.out.println("Please enter score between 0-100");
            exam2=user2.nextInt();
        }
        System.out.println("Please enter score for exam 3:");
        int exam3=user2.nextInt();
        double average = (exam1+exam2+exam3)/3;
        char score;
        if (average>=90 && average<=100){
            score='A';
        }else if (average>=80 && average<90){
            score='B';
        }else  if(average>=70){
            score='C';
        }else if (average>=60){
            score='D';
        }else {
            score='F';
        }
        System.out.println("Your score for all course is: "+score);
    }
}
