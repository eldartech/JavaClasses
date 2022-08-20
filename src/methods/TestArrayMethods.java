package methods;

import utilityMethods.ArrayMethods;

import java.util.Arrays;

public class TestArrayMethods {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
        ArrayMethods.printArray(numbers);
        String[] words ={"Miami","Chicago","Houston","Seattle","New York"};
        ArrayMethods.printArray(words);
        System.out.println("Printing 2D arrays");
        int[][] arr1 = {{12,3,3,4,5,},{2,4,3}};
        ArrayMethods.print_2D_Array(arr1);
        String [][] arr2 = {{"New York","Florida"},{"Illinois","Indiana"}, {"California","Washington"}};
        ArrayMethods.print_2D_Array(arr2);
        System.out.println("+++++++++++++++++");
        ArrayMethods.printArray(ArrayMethods.reverseArray(words));
        System.out.println("-------------------");
        System.out.println(Arrays.toString(ArrayMethods.reverseArray(words)));
        System.out.println("=================");
        System.out.println(Arrays.toString(ArrayMethods.reverseArray(numbers)));

        char[] letters2={'a','s','d','f','g','h','j','k','l'};
        System.out.println(Arrays.toString(letters2));
        ArrayMethods.reverseArray(letters2);

        String[] strArr = ArrayMethods.reverseArray(words);
        System.out.println(Arrays.toString(letters2));

        int [] nums ={1,2,3,3,2,3,4,100};
        System.out.println(ArrayMethods.averageOfNumbers(nums));

    }
}
