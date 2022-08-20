package projects.project;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any two words value with" +
                " spaces in the beginning and at end:"); // " Black coffee "
        String word = scanner.nextLine();
        String word1 = word.trim();
        String word2 = word1.substring(word1.indexOf(" ") + 1);
        String letterC =""+word2.charAt(0);
        String word3 = word2.replace(letterC,letterC.toUpperCase());
        String word4 = word1.replace(word2,word3);


        System.out.println(word4);
    }
}


        /*String word2= words.substring(words.indexOf(" ")+1);
        System.out.println(word1+" has length of: "+word1.length());
        System.out.println(word2+" has length of: "+word2.length());
        System.out.println(word1);*/






