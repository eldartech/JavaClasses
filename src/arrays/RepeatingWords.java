package arrays;

public class RepeatingWords {
    public static void main(String[] args) {
        String str = "java, python, java, c++, c++, javascript";
        // We need to print out only repeating words from this string
        // without a comma.
        String[] words = str.split(", ");
        for (String eachWord:words
             ) {
            System.out.println(eachWord+" ");
        }
        System.out.println("The repeating words are printed below");
        for (int i = 0; i <words.length ; i++) {

            for (int j = i+1; j <words.length ; j++) {
                if(words[i].equals(words[j])){
                    System.out.println(words[i]);
                    break;
                }
            }
        }
        // Print out only non-repeating words
        // In the following format if the word is repeating
        // It won't go remaining lines of outer loop when if condition is true
       // [java, python, java, c++, c++, javascript]
        System.out.println("These are non repeating words");
        OUTER:for (int i = 0; i <words.length ; i++) {

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]) && i != j)

                {

                    continue OUTER;
            }}
            System.out.println(words[i]);
        }
    }
}
