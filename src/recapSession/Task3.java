package recapSession;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three word phrase");
        String word1 = scanner.nextLine();
        System.out.println("Please enter one more");
        String word2 = scanner.nextLine();
        System.out.println("please enter one more");
        String word3 = scanner.nextLine();

        if (     (word1.length()==word2.length())
                && (word3.length()==word2.length())
                && (word1.toLowerCase().contains("java"))
                && (word2.toLowerCase().contains("java"))
                && (word3.toLowerCase().contains("java"))
                && (word1.charAt(0) >= 'A' && word1.charAt(0) <= 'Z')
                && (word2.charAt(0) >= 'A' && word2.charAt(0) <= 'Z')
                && (word3.charAt(0) >= 'A' && word3.charAt(0) <= 'Z')

        )

        {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
        }
    }




/*

Using scanner ask the user to enter 3 String
 words and print true if length of 3 string is
same and all of them contains the "java" and all
 of them starts with upper case any letter.
For Example:
"I love java." -> length is 10
"We use java." -> length is 10
"Java is best" -> length is 10
Since all the sentences contain the java
 and start with upper case and length is the
 same the output will be true.
Output:
true
 */