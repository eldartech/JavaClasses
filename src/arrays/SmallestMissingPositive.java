package arrays;

import java.util.Arrays;

public class SmallestMissingPositive {
//    You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.
//            Example 1:
//    Input:
//    N = 5
//    arr[] = {1,2,3,4,5}
//    Output: 6
//    Explanation: Smallest positive missing
//    number is 6.
//    Example 2:
//    Input:
//    N = 5
//    arr[] = {0,-10,1,3,-20}
//    Output: 2
//    Explanation: Smallest positive missing
//    number is 2.
//    Your Task:
//    The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.

    public static void main(String[] args) {

        int  nums[] = {0,-10,1,2,3,4,-20};

        int smallestMissing = 1;

        Arrays.sort(nums);
        // -20 , -10 ,0 , 1,3
        // If i print in the loop i don't print outside
        // if i didn't print anything in the loop I should print something outside.
        boolean didIPrint =false;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<=0)
                continue;
            if(nums[i]!=smallestMissing){
                System.out.println(smallestMissing);
                didIPrint=true;
                break;
            }
            smallestMissing++;

        }
        if (!didIPrint){
            System.out.println(smallestMissing);
        }









    }
}
