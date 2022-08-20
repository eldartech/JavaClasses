package forLoop;

public class FindDuplicates {

    // If string has a duplicate letter print string has a duplicate.
    // Find the duplicate letter in the fastest way possible.
    public static void main(String[] args) {
        String str = "kklt";
// if i can use a for loop that starts from i+1 and checks till the end
        // I need to compare two chars in the string.

        for (int i = 0; i <str.length() ; i++) {
         // charAt(i) is the letter that i should check if it has a duplicate
            for (int k=i+1;k<str.length();k++){
                if (str.charAt(k)==str.charAt(i)){
                    System.out.println("String has a duplicate");
                }
            }
        }






    }
}
