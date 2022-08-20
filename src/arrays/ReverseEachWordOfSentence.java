package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachWordOfSentence {

    /*
    ask user to input a sentence
    reverse each word in sentence
    ex: "I love Java"
    output : [I, evol, avaJ]
     */
    public static void main(String[] args) {
        System.out.println("Please enter sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String[] reversedWords = new String[words.length];
        for (int i=0;i< words.length;i++){
            String tempWord = "";
            for (int j = words[i].length()-1;j>=0;j--){
                tempWord+=words[i].charAt(j);
            }
            reversedWords[i]=tempWord;

        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(reversedWords));
    }
}
