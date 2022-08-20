package arrays;

import java.util.Arrays;

public class MutliDimensional2 {

    public static void main(String[] args) {

        int[][] numbers = new int[3][5];


        numbers[0][2]=200;
        numbers[1][3]=300;
        numbers[2][4]=10;
        numbers[1][2]=6;
// numbers[0]  -> [0, 0, 200, 0, 0],
        System.out.println(Arrays.deepToString(numbers));
//[[0, 0, 200, 0, 0], [0, 0, 6, 300, 0], [0, 0, 0, 0, 10]]
// How can we print out all elements individually.(multidimensional)
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println("==================================");
        System.out.println("In the loop");
        for (int i = 0; i <numbers.length ; i++) {
           // System.out.println(Arrays.toString(numbers[i]));
            // numbers[i] -> is an array.
            for (int j=0;j<numbers[i].length;j++){
                System.out.println(numbers[i][j]);

            }
        }
/// For Each



        /*
        for(DataType d:storage){}
         */
//[[0, 0, 200, 0, 0], [0, 0, 6, 300, 0], [0, 0, 0, 0, 10]]
        System.out.println("Inside for each loop" +
                "\n +++++++++++++++++++++");
        for (int[] innerArrays:numbers) {
         //   System.out.println(Arrays.toString(innerArrays));
            for (int number: innerArrays) {
                System.out.println(number);
            }
        }















    }
}
