package arrays;

public class FindAllOdds {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        // Print all the odd numbers from the array.
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2==1){
            System.out.println(nums[i]);}
        }
    }
}
