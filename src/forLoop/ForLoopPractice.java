package forLoop;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        char answer;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to continue?");
            answer=scanner.next().charAt(0);
        }while (answer=='Y' || answer=='y');
    }
}
