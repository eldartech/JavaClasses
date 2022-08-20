package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNum {
    /*
    ask user to input 10 numbers
    print out the largest  and smallest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)    ;
        int[] nums = new int[10];
        for (int i=0;i<nums.length;i++){
            System.out.println("Please enter the values of num["+i+"]:");
            nums[i]=scanner.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        for (int i=0;i<nums.length;i++){

            if (nums[i]>max){
              max=nums[i];
            }
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Smallest number in "+ Arrays.toString(nums)+" is "+min);
        System.out.println("Largest number in "+ Arrays.toString(nums)+" is "+max);
    }

}
