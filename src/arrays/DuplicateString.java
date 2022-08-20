package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateString {
    /* user to enter 8 words
    store them in 3D array
    print count of duplicate values
    print count of unique(distinct) values

     */
    public static void main(String[] args) {
        String[][][] words = new String[2][2][2];
        Scanner scanner = new Scanner(System.in);
        String wordsStr = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                for (int k = 0; k < words[i][j].length; k++) {
                    System.out.println("Please enter word for ["+i+"]["+j+"]["+k+"]");
                    words[i][j][k] = scanner.next();
                    wordsStr += words[i][j][k] + ",";
                }
            }
        }
        System.out.println(Arrays.deepToString(words));
        String[] wordsArr = wordsStr.split(",");
        int countDupes = 0;
        for (int i = 0; i < wordsArr.length; i++) {
            for (int l = i + 1; l < wordsArr.length; l++) {
                if (wordsArr[i].equalsIgnoreCase(wordsArr[l])) {
                    countDupes++;
                }else {
                    continue;
                }
            }
        }

        int countUniques = (wordsArr.length-countDupes);

        System.out.println("Amount of dupes: " + countDupes);
        System.out.println("Amount of uniques: " +countUniques);
    }
}
