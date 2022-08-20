package projects.project5;

import java.util.Scanner;

public class task4STARTREE {
    public static void main(String[] args) {
                Scanner scanner=new Scanner (System.in);
                System.out.println("Please enter number"); //determines how many rows
                int number=scanner.nextInt();
                for (int i=1; i<=number;i++) {
                    for (int j=0; j<i;j++)   // determines how many columns
                { System.out.print(i);
                }
                    System.out.println();
                }
    }
}






