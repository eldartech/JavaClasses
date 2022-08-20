package stringMethods;

import java.util.Locale;

public class StringMethodChainingPractice {

    public static void main(String[] args) {
        String str1= "   I love Techtorial   ";
        String strChaining= str1.toUpperCase().substring(5).replace("T","t").trim().toLowerCase();
        System.out.println(strChaining);
        char letter = str1.toUpperCase().substring(5).replace("T","t").trim().toLowerCase().charAt(10);
        System.out.println(str1.toUpperCase().substring(5).replace("T","t").trim().toLowerCase().charAt(10));
/*
Create a String with multiple words on it
using string methods by chaining:
                    > toUpperCase()
                    > substring(startIndex)
                    > replace("letter","$")
      print by method chaining:
                    > toLowerCase()
                    > substring(startIndex,endIndex)
                    > replace("letter", "*")

 */

        String sentence5 = "    I love Miami and Chicago both!        ";
        String newSentence5 = sentence5.toUpperCase().substring(10).replace("A" , "*");
        System.out.println(newSentence5);

        String new2Sentence5 = sentence5.toLowerCase().substring(10,15).replace("a", "**");
        System.out.println(new2Sentence5);


        String str = "Hello world";// --> String literal
        String str2="Hello world";
        String str3= new String("Hello world");
        System.out.println(str==str2);//true
        System.out.println(str==str3);//false
        System.out.println(str.equals(str2));//true
        System.out.println(str.equals(str3));//true
    }
}
