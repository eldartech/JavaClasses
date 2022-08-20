package map;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import static map.CountOccurrence.getEachWord;

public class Dictionary {
    /*
    method with will return words by first letter
    accept String sentence
    return TreeMap<Character,List<String>> of letter and multiple words

    Whether, you are working on a new cutting edge app or simply ramping up on new yellow technology

    {W=[Whether], y=[you, yellow], a=[are,a,app]
     */
    static TreeMap<Character, ArrayList<String>> getWordsByLetters(String sentence) {
        String[] words = getEachWord(sentence);
        TreeMap<Character, ArrayList<String>> result = new TreeMap();
        for (String word : words) {
            if (!result.containsKey(word.charAt(0))) {
                ArrayList<String> listOfWords = new ArrayList<>();
                listOfWords.add(word);
                result.put(word.charAt(0), listOfWords);
            } else {
                result.get(word.charAt(0)).add(word);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter words: ");
        String input = scanner.nextLine();
        System.out.println(getWordsByLetters(input));

    }


}
