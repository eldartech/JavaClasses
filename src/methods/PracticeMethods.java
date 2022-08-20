package methods;

import utilityMethods.ArrayMethods;

public class PracticeMethods {
    public static void main(String[] args) {
        int[] arr = {12,34,54,33,23};
        boolean isContains = ArrayMethods.arrayContains(arr,100);
        System.out.println(isContains);
        System.out.println(ArrayMethods.arrayContains(arr,54));
        char[] charArr = {'A','D','Z','L','W'};
        char element = 'Y';
        System.out.println(ArrayMethods.arrayContains(charArr,element));
        String[] words = {"Java","Python","PHP","JavaScript"};
        System.out.println(ArrayMethods.arrayContains(words,"Java"));
    }
}
