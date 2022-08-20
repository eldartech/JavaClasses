package stringIntro;

import java.util.Scanner;

public class WarmUpClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str1 =scanner.next();
        int strLength=str1.length();
        System.out.println("length is: "+strLength);//11
        System.out.println("Please input letter: ");
        String letter=scanner.next();
        System.out.println(str1.indexOf(letter));
        System.out.println("Input the index of the letter: ");
        int index=scanner.nextInt();
        System.out.println(str1.charAt(index));
        System.out.println("Input additional word");
        String additionalWord=scanner.next();
        System.out.println(str1.concat(additionalWord));
        System.out.println("Please input the index of the word to substring: ");
        int subStrIndex=scanner.nextInt();
        System.out.println(str1.substring(subStrIndex));
        System.out.println("Please input inbound and outbound indexes of the word to substring: ");
        int subStrIndexIn=scanner.nextInt();
        int subStrIndexOut=scanner.nextInt();
        System.out.println(str1.substring(subStrIndexIn,subStrIndexOut));











    }
}
