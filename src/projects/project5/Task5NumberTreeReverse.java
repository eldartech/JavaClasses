package projects.project5;

import java.util.Scanner;

public class Task5NumberTreeReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i=1; i<=num; num--) {  //determines number of rows
                for (int j=num; j>=i;j--)       // determines number of columns
            { System.out.print(num);
            }
            System.out.println();
        }
    }
}