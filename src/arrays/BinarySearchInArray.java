package arrays;

import java.util.Arrays;

public class BinarySearchInArray {

    public static void main(String[] args) {
        String str = "Java";
        // What do I use if I want to find location of v?
       // str.indexOf('v'); -> 2
        // str.indexOf('a'); -> 1
        char[] chars = new char[]{'j','a','v','a'};
        // In this array I want to find location of v?
        // To be able to get right results with binary search
        // we must sort the array.
        System.out.println(Arrays.binarySearch(chars,'v')); //-> 2
        // Binary search method returns FIRST index of provided element from array.
        String[] colors = {"violet","blue","a","blue","purple"};
        int indexOfFirstBlue=Arrays.binarySearch(colors,"blue");
        System.out.println(Arrays.binarySearch(colors,"blue")); // -> 2
        // Following line will return second blue's index from an array.
        System.out.println(Arrays.binarySearch(colors,indexOfFirstBlue+1,colors.length-1,"blue"));


    }
}
