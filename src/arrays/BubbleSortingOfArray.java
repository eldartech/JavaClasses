package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortingOfArray {
    /*
    ask user to enter 10 numbers
    sort numbers using bubble sorting method
    ex: {8,1,4,3,4,5,6,7}
    output: {1,3,4,4,5,6,7,8}
    Pseudocode:
    for(i=0){
        for(j=1){
            if(i>j)
            int temp = i;
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

     */
    public static void main(String[] args) {
        Random random  = new Random();
        int[] numbers = new int[10];
        for (int i=0; i<numbers.length;i++){
            numbers[i]=random.nextInt(100);
        }
        System.out.println("Stored numbers are: "+ Arrays.toString(numbers));
        for (int outer=0;outer<numbers.length;outer++){
            for (int inner=outer+1;inner<numbers.length;inner++){
                int temp=0;
                if (numbers[outer]>numbers[inner]){
                    temp=numbers[outer];
                    numbers[outer]=numbers[inner];
                    numbers[inner]=temp;
                }
            }
        }
        System.out.println("Sorted numbers are: "+Arrays.toString(numbers));

    }

}
