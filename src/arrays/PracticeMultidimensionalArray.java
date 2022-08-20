package arrays;

import java.util.Arrays;
import java.util.Random;

public class PracticeMultidimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] nums = new int[3][3];
        nums[0][0]=random.nextInt(100);
        nums[0][1]=random.nextInt(100);
        nums[0][2]=random.nextInt(100);
        nums[1][0]=random.nextInt(100);
        nums[1][1]=random.nextInt(100);
        nums[1][2]=random.nextInt(100);
        nums[2][0]=random.nextInt(100);
        nums[2][1]=random.nextInt(100);
        nums[2][2]=random.nextInt(100);

        System.out.println(Arrays.deepToString(nums));
        System.out.println("For Loop Print Out:");

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("For Each Print Out:");
        int [] otherNums={14,2,35,3,4};
        int numbers[][]={{123,123,123},{13,53,123}};
        for (int[] num:numbers){
            for (int item:num){
                System.out.println(item);
            }
        }
        //------------3D Array-----------

        int [][][] nums3d = {
                {{23,23,13},{12,34,54},{12,34,54}},
                {{99,67,34,23},{12,43,43},{12,34,54}},
                {{43,23,88,66},{66,55,44},{12,34,54}}
        };
        System.out.println(Arrays.deepToString(nums3d));
        for (int[][] array3:nums3d){
            for (int[] array2:array3){
                for (int array:array2){
                    System.out.print(array+" | ");
                }
                System.out.println();
            }
            System.out.println();
        }





    }
}
