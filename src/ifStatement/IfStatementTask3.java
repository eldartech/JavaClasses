package ifStatement;

import java.util.Scanner;

public class IfStatementTask3 {
    /*
    String user="";
    String password="lskjdf";
    Log in
    Using Scanner
    Ask user to enter username
    ask user to enter  password
    if user and password matching
    print out Log in successful
    &&

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName="techtorialMiami";
        String password ="password12345$";
        String userNameInput = scanner.next();
        String passwordInput = scanner.next();
        if (userName.equals(userNameInput) && password.equals(passwordInput)){
            System.out.println("Log in is successful!");
        }
        if (!(userName.equals(userNameInput) && password.equals(passwordInput))){//not false == true
            System.out.println("Log in failed!");
        }



    }
}
