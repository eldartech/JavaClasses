package utilityMethods;

public class NumericMethods {

    /**
     * averageOfNumbers accepts 2 int parameters,
     * it will return average of 2 numbers
     *
     * @param num1
     * @param num2
     * @return double
     */
    public static double averageOfNumbers(double num1, double num2) {
        double result = (num1 + num2) / 2;
        return result;
    }

    /**
     * reverseNumber accepts 1 int and returns reversed int
     * @param number
     * @return int
     */
    public static int reverseNumber(int number) {
        int reversedNum = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
        }
        return reversedNum;
    }

    /**
     * isPalindromeNumber accepts 1 int, and returns boolean.
     * Method checks if number is palindrome or not.
     * @param number
     * @return
     */
    public static boolean isPalindrome(int number){
        return number==reverseNumber(number);
    }


}
