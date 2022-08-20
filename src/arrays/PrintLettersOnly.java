package arrays;

public class PrintLettersOnly {
    public static void main(String[] args) {
        char []charachters = {'3','!','@','z','S'};
        // Print out only letters from this array using
        // for each loop.
        for (char c:charachters
             ) {
            // Uppercase letters
            // Lowercase letters
            if ((c>='a'&&c<='z')||(c<='Z'&&c>='A')){
                System.out.println(c);
            }
        }
    }
}
