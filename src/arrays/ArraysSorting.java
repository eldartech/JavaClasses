package arrays;

import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
        // Arrays.sort(arrayName);
        // It will sort the array for us.
        // It will sort smaller value to bigger value. (ascending order)

   int[] nums = {3,5,6,7,1,2,0};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // array is a mutable object in java.


    }
}
