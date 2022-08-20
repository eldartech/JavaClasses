package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GetIndexOfElement {
    /*
    ask user to enter 10 numbers
    store them in array
    ask user to pick number
    print the index of that number
    Ex: {1,2,3,4,5,6,7,8}
    5
    output: index of 5 is 4
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int t=0;t<numbers.length;t++){
            numbers[t]=scanner.nextInt();
        }
        System.out.println("Please pick a number form "+ Arrays.toString(numbers));
        int element = scanner.nextInt();
       /* int i=0;
        for (int number:numbers){
            i++;
            if (number==element){
                System.out.println(i);
            }
        }*/
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]==element){
                System.out.println("Index of "+numbers[i]+" is "+i);
            }
        }
    }
}
