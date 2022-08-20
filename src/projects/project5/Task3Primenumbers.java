package projects.project5;


import java.util.Scanner;

public class Task3Primenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if (number==2 || number == 3 || number == 5 || number == 7) {
            System.out.println("Is prime");
        } else if (number%2==0 || number%3==0 || number%5==0 || number%7==0){
            System.out.println("NOT prime");
        } else {
            System.out.println("YES prime");
    }

    }
}
