package arrays;

import java.util.Arrays;

public class MultiDimensional1 {
    public static void main(String[] args) {
      int numbers[][] =new int[2][4];
        System.out.println(Arrays.toString(numbers));
        // Arrays.toString method won't work with multidimensional arrays.
        System.out.println(Arrays.deepToString(numbers));
       // [[0, 0, 0, 0], [0, 0, 0, 0]]
        String [][] strings = new String[2][2];
        System.out.println(Arrays.deepToString(strings));
        // null is the default value for every object in java.
        // String is an immutable object in java.
        //[[null, null], [null, null]]

        strings[1][0]="flower";
        System.out.println(Arrays.deepToString(strings));
        //[[null, null], [flower, null]]
        strings[0][1]="coding";
        //  //[[null, coding], [flower, null]]
        System.out.println(Arrays.deepToString(strings));

        strings[0][1]= "java";
        System.out.println(Arrays.deepToString(strings));
       ////  //[[null, java], [flower, null]]




    }
}
