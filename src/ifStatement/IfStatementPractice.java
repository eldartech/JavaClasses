package ifStatement;

import java.util.Scanner;

public class IfStatementPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int b,h;
        System.out.println("Please input breadth");
      b=input.nextInt();
        System.out.println("Please input width");
      h=input.nextInt();
      if (b==h){
          System.out.println("it is square");
      }
        if (b!=h) {
            System.out.println("it is not square");
        }
    }
}
