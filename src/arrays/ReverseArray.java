package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        char[] letters = {'s','d','f','g','h','j','k','l'};
       for (int left = 0,right=letters.length-1;left<right;left++,right--){
           char temp = letters[left];
           letters[left]=letters[right];
           letters[right]=temp;
       }
        System.out.println(Arrays.toString(letters));

    }
}
