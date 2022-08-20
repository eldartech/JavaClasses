package projects.project5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=s.nextLine();

        int length=word.length()-1;
        String reversedword="";

        for(     ;length>=0;length--){
           reversedword = reversedword + word.charAt(length);
        }
        System.out.println(reversedword.trim());

    }
}
