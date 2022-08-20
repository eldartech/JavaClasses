package arrays;

public class CountOfWord {

    public static void main(String[] args) {

        String str ="abc class java coding abc computer abc microphone";
        // Find the count of abc word in this string.
        String[] words= str.split(" ");
        // Everytime when I see abc in this words array
        // I should increase its count
        int countOfAbc =0;
        for (String word:words) {
            if (word.equals("abc")){
                ++countOfAbc;
            }
        }

        System.out.println("Count of word abc is "+ countOfAbc);


    }
}
