package forLoop;

import java.util.Scanner;

public class ReverseString {
    /*using scanner
    ask user to input word
    store each letter of word in reversed order into String data type
    print reversed word and replace 1st letter with "*" and last letter with "$"

   task:
   count amount of vowels and consonants
   - word contains [amount] vowels
   - word contains [amount] consonants
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        String reversedWord ="";
        int vowelsCount=0;
        int consonantsCount=0;
        for (int index = word.length()-1;index>=0;index--){
            System.out.println(word.charAt(index));
            reversedWord+=word.charAt(index);
            if (word.toUpperCase().charAt(index)=='A'||word.toUpperCase().charAt(index)=='E'||word.toUpperCase().charAt(index)=='O'
                    ||word.toUpperCase().charAt(index)=='I'||word.toUpperCase().charAt(index)=='U'){
                vowelsCount++;
            }else {
                consonantsCount++;
            }
        }
        System.out.println(reversedWord.replace(""+word.charAt(0),"*")
                .replace(""+word.charAt(word.length()-1),"$"));
        System.out.println(word+" contains "+vowelsCount+" vowels.");
        System.out.println(word+" contains "+consonantsCount+" consonants.");

    }
}
