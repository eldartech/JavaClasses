package ifStatement;

import java.util.Scanner;

public class IfStatementTask2 {
    /*
    Using Scanner
    - ask user to input number
    - print out if number is odd or even
    Pseudocode:
    Scanner
    ask user to input number
    store the input in int
    if(number%2==0)
    sout(number is even);
    if(number%2==1)
    sout(number is odd);
     */
     static public void main(String[] a) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Please enter any number: ");
         int number = scanner.nextInt();
         if (number%2==0){
             System.out.println(number+" is even number.");
         }
         if (number%2==1){
             System.out.println(number+" is odd number.");
         }
    }
}
