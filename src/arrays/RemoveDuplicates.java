package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] digits = {5,4,5,6,7,8,9,1,2,2,3,8};
        // 0 1 2 3 4 5 6 7  8 9
        // Remove the duplicate values in this array
        //{5,4,6,7,8,9,1,2,3}
        // First we should loop thru digits
        // Lets add every element from array to the string for each iteration.
        // If the string contains current element we are about to add
        // we should skip that element
        int a = 7;
        String string = a+"";
        // string = "7"
        String elementFromArray ="";
        for (int digit:digits) {
            String digitStr = digit+""; // If the int is 5 this string will be "5"
            if(!elementFromArray.contains(digitStr)){
                elementFromArray+=digitStr;
            }
        }
        System.out.println(elementFromArray);



        char[] withoutDuplicates =elementFromArray.toCharArray();

        System.out.println(Arrays.toString(withoutDuplicates));
    }
}
