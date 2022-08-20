package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


        String[] letters = {"a", "b", "c", "d", "d", "e", "e", "e"};
     Arrays.sort(letters);
        System.out.println(Arrays.binarySearch(letters,"d"));
        int indexOfFirstD = Arrays.binarySearch(letters,"d");
       int secondD= Arrays.binarySearch(letters,indexOfFirstD+1,letters.length-1,"d");
        System.out.println(secondD);
        System.out.println(Arrays.binarySearch(letters,"e"));
        System.out.println(Arrays.binarySearch(letters,"f"));
    }
}