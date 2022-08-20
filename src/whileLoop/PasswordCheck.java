package whileLoop;

import java.util.Scanner;

public class PasswordCheck {
    /*
    using scanner ask user to enter password
    - check for uppercase and lowercase
    - check for symbols
    - check for number
    if every condition met you print valid password
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password");
        String password = scanner.next();
        int index = 0;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSymbols = false;
        boolean hasNumbers = false;
        while (index < password.length()) {
            if (password.charAt(index) >= 'A' && password.charAt(index) <= 90) {
                hasUppercase = true;
            } else if (password.charAt(index) >= 'a' && password.charAt(index) <= 'z') {
                hasLowercase = true;
            } else if ((password.charAt(index) >= 33 && password.charAt(index) <= 47)
                    || (password.charAt(index) >= 58 && password.charAt(index) <= 64)
                    || (password.charAt(index) >= 91 && password.charAt(index) <= 96)
                    || (password.charAt(index) >= 123 && password.charAt(index) <= 126)) {
                // condition1 && condition2   // condition1 || condition2
                hasSymbols = true;
            }else {
                hasNumbers = true;
            }
            ++index;
        }
        if (hasLowercase==true && hasUppercase==true && hasSymbols==true && hasNumbers==true){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }
    }
}
