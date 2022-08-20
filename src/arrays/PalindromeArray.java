package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {
    /*
    1991
    user inputs 10 numbers , store them in array
    identify if array is palindrome or not
    Ex: {1,2,3,4,3,2,1}
    out: true
    {1,2,3,4,5,3,2,1}
    out: false
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int o = 0; o < numbers.length; o++) {
            System.out.println("Please enter number for [" + o + "]");
            numbers[o] = scanner.nextInt();
        }
        boolean isPalindrome = true;
        int t = numbers.length - 1;
        //{1,2,3,4,5,3,2,1}
        for (int q = 0; q < numbers.length / 2; q++, t--) {
            if (numbers[q] != numbers[t]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println(Arrays.toString(numbers) + " is Palindrome Array");
        else
            System.out.println(Arrays.toString(numbers) + " is not Palindrome Array");
    }
}
