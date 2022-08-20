package arrays;

public class SentenceExample {

    public static void main(String[] args) {

        String words[] = new String[]{"I","love","coding","with","java."};
        // In this array we are given words of sentences
        // Put this all words in one string and print it out.
        // Check if that string is equal to
        //
        // "I love coding with java."
String expected ="I love coding with java";
String sentenceFromArray = "";
        for (String string:words) {
         sentenceFromArray+= string+" ";

        }
        System.out.println(sentenceFromArray);
       sentenceFromArray= sentenceFromArray.trim();
boolean result = expected.equals(sentenceFromArray);
        System.out.println(result);
    }
}
