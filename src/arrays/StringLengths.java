package arrays;

import java.util.Arrays;

public class StringLengths {
    public static void main(String[] args) {


    String[] words = {"word","computer","coding","programming","jatva"};
    // Print the word which has the biggest length in this array.
    // I should find the biggest length then I should print the word which has that length
    String theBiggestLengthWord =words[0];
    int biggestLength=words[0].length();
        for (int i = 1; i <words.length ; i++) {
            if(biggestLength<words[i].length()){
                biggestLength=words[i].length();
                theBiggestLengthWord=words[i];
            }
        }
        System.out.println(biggestLength);
        System.out.println(theBiggestLengthWord);
        // Print the word which has the smallest length in this array.
        String shortest=words[0];
        int shortestLength=words[0].length();
        for (int i = 1; i <words.length ; i++) {
            if (shortestLength>words[i].length()){
                shortest=words[i];
                shortestLength=words[i].length();
            }
        }
        System.out.println(shortest);
        System.out.println(shortestLength);
       // Create another length array and store all the lengths from word array in this new
        // array.
      //  words = {"word","computer","coding","programming","java"};
        int [] lengths = new int[words.length];
        for (int i = 0; i <lengths.length ; i++) {
            lengths[i]=words[i].length();
        }
        System.out.println(Arrays.toString(lengths));
}}
