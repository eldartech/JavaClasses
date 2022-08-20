package arrayList;

import java.util.ArrayList;

public class ArrayListPracticeAddGet {
     /*
        create array list storing the letters A-Z
        method to check if letter is vowel or not  boolean isVowel(char )
        method to print Vowels accept List of chars

        print out only vowels
        static void printVowels(List<Character> letters)

         */
     public static void main(String[] args) {
         ArrayList<Character> letters = new ArrayList<>();
         for (char letter='A';letter<='Z';letter++){
             letters.add(letter);
         }
         System.out.println(letters);

         printVowels(letters);
         printConsonants(letters);
         String word = "Techtorial";
         printVowels(word);
         printConsonants(word);
     }

     static boolean isVowel(char letter){
         if (letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'){
             return true;
         }
         return false;
     }

     static void printVowels(ArrayList<Character> letters){
         System.out.println("Vowels: ");
         for (int i=0;i<letters.size();i++){
             if (isVowel(letters.get(i))){
                 System.out.println(letters.get(i));
             }
         }
     }

     static void printVowels(String word){

         System.out.println("Vowels of word:");
         for (int i=0;i<word.length();i++){
             if (isVowel(word.toUpperCase().charAt(i))){
                 System.out.println(word.charAt(i));
             }
         }
     }

     static void printConsonants(ArrayList<Character> letters){
         System.out.println("Consonants:");
         for (int i=0;i<letters.size();i++){
             if (!isVowel(letters.get(i))){
                 System.out.println(letters.get(i));
             }
         }
     }

     static void printConsonants(String word){
         System.out.println("Consonants:");
         for (int i=0;i<word.length();i++){
             if (!isVowel(word.toUpperCase().charAt(i)))
             System.out.println(word.charAt(i));
         }
     }


}
