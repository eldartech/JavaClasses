package recapSession;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String string1= "  Snicker  ";
        String string2= "Cookie";
        System.out.println(string1.trim().toUpperCase().substring(0,7).charAt(3));
        System.out.println(string2.toLowerCase().replace("o","u").concat("s").startsWith("c"));
    }

}


/*
* Please use method chaining for the following Strings.
*  Methods are provided next to the String.
String “ Snicker “; —> trim, toUpperCase,
* substring and charAt methods
String “Cookie” —> toLowerCase,
* replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C’
*
* */