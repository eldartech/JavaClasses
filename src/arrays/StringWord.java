package arrays;

public class StringWord {

    public static void main(String[] args) {
        // Print out all the words that start with aa
        // Using for each loop
        String words[] =new String[]{"aa","abaa", "aaa","tttt"};

        for (String word :words  ) {
            if (word.startsWith("aa")){
                System.out.println(word);
            }
        }




    }
}
