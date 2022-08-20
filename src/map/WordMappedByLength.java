package map;

import java.util.*;

public class WordMappedByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<>();
        boolean answer = true;
        do {
            System.out.println("Please enter a word: ");
            words.add(scanner.next());
            System.out.println("Do you want to continue: ");
            String response = scanner.next();//no
            answer = response.equalsIgnoreCase("yes") ? true : false;
        } while (answer);
        System.out.println(words);
        System.out.println(storeByCount(words));

        printMappedWords(storeByCount(words));
    }

    public static LinkedHashMap<Integer, LinkedList<String>> storeByCount(LinkedList<String> words) {
        LinkedHashMap<Integer, LinkedList<String>> result = new LinkedHashMap<>();

        for (String word : words) {
            if (!result.containsKey(word.length())) {
                LinkedList<String> filteredWords = new LinkedList<>();
                filteredWords.add(word);
                result.put(word.length(), filteredWords);
            } else {
                result.get(word.length()).add(word);
            }
        }
        return result;
    }
   public static void printMappedWords(LinkedHashMap<Integer,LinkedList<String>> words){
       for (Map.Entry<Integer,LinkedList<String>> word:words.entrySet()) {
           System.out.println("Words with length of "+word.getKey());
           for (String item:word.getValue()) {
               System.out.println(item);
           }
       }
   }
}
