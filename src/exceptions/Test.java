package exceptions;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        // File path is passed as parameter
        File file = new File(
                "src/exceptions/text.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
      //  BufferedReader br = new BufferedReader(new FileReader(file));
        FileReader br=new FileReader(file);

        // Declaring a string variable
        String st;
        int i;
        // Condition holds true till
        // there is character in a string
       // while ((st = br.readLine()) != null)
            while ((i = br.read()) != -1)
            // Print the string
            System.out.print((char)i);

        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
    }
}

