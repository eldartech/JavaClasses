package stringFormat;

import java.util.Locale;
import java.util.Scanner;

public class StringFormatPractice {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a 1st word:");
        String word1=scanner.next();
        System.out.println("Please enter a 2nd word:");
        String word2 = scanner.next();
        System.out.println("Please enter 1st number: ");
        String number1 = scanner.next();
        System.out.println("Please enter 2nd number: ");
        String number2 = scanner.next();
        String formattedStr = String.format("User entered: %S, %s%n%d"
                ,word1,word2,Integer.parseInt(number1)+Integer.parseInt(number2));
       // System.out.println(formattedStr);
        System.out.print("Word 1\nWord2");

        System.out.printf("User entered: %-10S, %s%n%30d%n"
                ,word1,word2,Integer.parseInt(number1)+Integer.parseInt(number2));

        System.out.printf(Locale.US,"%,d%n",10000);
        System.out.printf(Locale.ITALY, "%,d",10000);









    }
}
