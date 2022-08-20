package arrays;

import java.util.Arrays;

public class ThreeDimensional {

    public static void main(String[] args) {
      // String    String [][][] letters=    new String[legnth][length][length];








        String [][][] letters=  { {{"a","b"},{"a"},{}},{{"d"},{},{}} };

        System.out.println(letters[0][2].length);
        System.out.println(Arrays.deepToString(letters));


       OUTER: for (int i = 0; i <letters.length ; i++) {
           for (int j = 0; j <letters[i].length ; j++) {
               for (int k = 0; k <letters[i][j].length ; k++) {
                   System.out.println(letters[i][j][k]);
               }
           }
        }
        System.out.println("From for each loop \n ++++++++++++++++++++++++++++++++++++++++");
        for (String[][] twoDimensional:letters) {
            for (String[] singleDimension:twoDimensional) {
                for (String letter:singleDimension) {
                    System.out.println(letter);
                }
            }
        }



























    }
}
