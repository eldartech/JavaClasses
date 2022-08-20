package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    /*
    Ask user to enter 10 numbers
    Ask user to pick 1 number out of 10
    Remove it from array,
    EX
    {1,2,3,4,56,7,8,9}
    56 -> -1
    {1,2,3,4,7,8,9,0}

     */
    public static void main(String[] args) {
        int [] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int p =0; p<numbers.length;p++){
            numbers[p]=scanner.nextInt();
        }
        System.out.println("Which number do you want to remove?\n"+
                Arrays.toString(numbers));
        int expectedNumber= scanner.nextInt();
        int matchCount=0;
        for (int r=0; r<numbers.length;r++){
            if (numbers[r]==expectedNumber){
                matchCount++;
            }
        }
        int [] newNumbers = new int[numbers.length-matchCount];//5
        for (int o =0, u=0;o<numbers.length;o++){
            if (numbers[o]!=expectedNumber){
                newNumbers[u++]=numbers[o];
            }
        }
        System.out.println(Arrays.toString(newNumbers));
    }
}
