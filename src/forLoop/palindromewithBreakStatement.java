package forLoop;

public class palindromewithBreakStatement {

    // I want you to find out if the string is palindrome in the fastest way possible
    // civic , hannah ..
    public static void main(String[] args) {
        // we need two index numbers one starts from beginning the other starts from end
        // we should check all the indexes one by one end with beginning.
        String str ="utbhjhu";
        boolean isPalindrome =true;
        for (int i = 0,k=str.length()-1; i <k ; i++,k--) {
            if(str.charAt(i)!=str.charAt(k)){

                isPalindrome=false;
            break;
            }
        }
        System.out.println(isPalindrome);






    }




}
