package utilityMethods;

public class StringMethods {
    /**
     * reverseWord accepts 1 String parameter and returns reversed String value
     * @param word
     * @return
     */
    public static String reverseWord(String word){
        String reversedStr="";
        for (int i = word.length()-1;i>=0;i--){
            reversedStr+=word.charAt(i);
        }
        return reversedStr;
    }

    /**
     * isPalindrome checks if provided String is palindrome
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(reverseWord(word));
    }


    public static StringBuilder reverseString(String word){
        return new StringBuilder(word).reverse();
    }

}
