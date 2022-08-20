package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpitArraysCopyRange {
    public static void main(String[] args) {
        System.out.println("Enter 10 words:");
        Scanner input = new Scanner(System.in);
        String []words = new String[10];
        for(int i=0; i<words.length;i++){
            words[i]=input.next();
        }
        String [] strArr1 = Arrays.copyOfRange(words,0,words.length/2);
        String [] strArr2 = Arrays.copyOfRange(words,words.length/2,words.length);
        System.out.print("strArr1: ");
        for (String word:strArr1) {
            System.out.print(word+" ");
        }
        System.out.println("strArr2: ");

        for (String word:strArr2) {
            System.out.print(word+" ");
        }
    }
}
