package arrays;

import java.util.Arrays;

public class Merge2ArraysInto1 {
    /*
    create 2 arrays
    store the elements from both arrays to 3rd array
    ex:
    {A,B,C,D}
    {Y,U,I,O,P,P,P,O,N}

    output:
    {A,B,C,D,Y,U,I,O,P,P,P,O,N}
     */
    public static void main(String[] args) {
      /*  char[] arr1 =  {'A','B','C','D'};
        char[] arr2 = {'Y','U','I','O','P','P','P','O','N'};

        char[] mergedArr = new char[arr1.length+arr2.length];

        for (int h = 0;h< arr1.length;h++ ) {
        mergedArr[h]=arr1[h];
        }
        for (int w=0;w<arr2.length;w++){
            mergedArr[arr1.length+w]=arr2[w];
        }
       for (char letter:mergedArr){
           System.out.println(letter);
       }*/
        int [] num1 = new int[]{4,5,6,9,8}; // 5   4
        int [] num2 = new int[]{8,8,3,3,6,5,9,5,3,6}; // 10  9
        int [] num3 = new int[num1.length+num2.length]; // 14

        for (int i = 0; i < num1.length+num2.length ; i++) {

            if(   i     <       num1.length  ) {
                num3[i] = num1[i];
            } else if (    num1.length <= i ) {
                num3[i]=num2[i- num1.length];
            }

        }

        System.out.println(Arrays.toString(num3));

    }
}
