package arrays;


import java.util.Arrays;//wild card
import java.util.Locale;

public class PracticeArray {
    public static void main(String[] args) {
        String[]  nums = {"2","1","100","1000","9"};//
        nums[0]=nums[0].concat("80");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//null

        String cars[]={"SUV","Sedan","Convertable"};
       cars[0]= cars[0].concat("1000").replace("U","*");
        System.out.println(cars[0].concat("1000"));
        System.out.println(Arrays.toString(cars));






    }


}
