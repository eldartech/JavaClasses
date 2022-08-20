package arrays;

import java.util.Arrays;

public class StringArray2 {
    public static void main(String[] args) {
        String[] words = {"word","computer","coding","programming","java"};
        // remove first and last chars from the words if the word
        // contains c
        for (int i = 0; i <words.length ; i++) {
           // System.out.println(words[i]);
            if (words[i].contains("c")){
                // Substring method already doesn't include second index
              words[i]=  words[i].substring(1,words[i].length()-1);
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
