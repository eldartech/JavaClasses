package arrays;

import java.util.Arrays;

public class ArraysSorting2 {
    public static void main(String[] args) {

        String[] colors = {"violet","pink","red","blue","purple"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors)); //Output ?
        String a = "blue";
        String[] mixedColors= {"Yellow","Red","purple",a};


        Arrays.sort(mixedColors);
        System.out.println(Arrays.toString(mixedColors)); // Output ?
        // "Red", "Yellow", "purple","blue"
        // The reason for this is , in ASCII table upper case letters have smaller value.


    }
}
