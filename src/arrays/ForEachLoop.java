package arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] nums = {65, 66, 68, 69, 70, 71};//-> length is 6
        // In this array we store integer numbers
        // 127 <- byte
// 32000 <-short
// This loop will print the elements from first element to last element.
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

//        for (What we store in the array:arrayName ) {
//          this loop will take the elements from first to last.
//        }
// this num is going to become every element in the array one by one.
        //first iteration num =nums[0]
        // second iteration num = nums[1]
        //  Till the last element
        for (int num :nums ) {
            System.out.println(num);
        }








    }}
