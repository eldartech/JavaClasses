package whileLoop;

import java.util.Scanner;

public class StartreePractice {
    public static void main(String[] args) {
        // Ask user one integer number
        // make a star tree for that many lines
        // 4
        // *
        // **
        // ***
        // ****
        // First ask user using scanner
        // update the number by increasing
        // Inside while loop add printing.
        // What should we print in the print.out?
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String str="*";
        while (num>0){

            System.out.println(str);
            str=str+"*";
            // "*" ++
            num--;
        }











    }
}
