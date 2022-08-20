package stringMethods;

import java.sql.SQLOutput;

public class StringMethodPractice1 {
    public static void main(String[] args) {
        System.out.println("**************charAt***************");

        String str1 = "Chicago";//7-1
        //  01234
        System.out.println(str1.charAt(2));
        char letter = str1.charAt(4);
        System.out.println(letter);
        System.out.println(str1.length());
        int length = str1.length();
        char lastLetter = str1.charAt(length - 1);
        System.out.println("Last letter of " + str1 + " is " + lastLetter);
        //  System.out.println(str1.charAt(length-2));
        System.out.println("**************concat***************");
        String str2 = "Los";
        String str3 = "Angeles";
        String result = str2.concat(" " + str3);
        System.out.println(result.toUpperCase());
        System.out.println("**************index***************");
        String name = "techtorial";
        //             0123456789
        int secondT = name.indexOf("t", 3);
        System.out.println(name.indexOf("t"));
        System.out.println(secondT);

        String sentence = "I love Java!";
        System.out.println(sentence.indexOf("love"));
        System.out.println("**************LowerCase/UpperCase***************");
        String country = "United States of America";
        String capCountry = country.toUpperCase();
        System.out.println(capCountry);
        String lowCountry = country.toLowerCase();
        System.out.println(lowCountry);
        System.out.println("**************Contains***************");
        String str5 = "Practicing string methods";
        String str6 = "string";
        boolean strContains=str5.contains(str6);
        System.out.println(str5.contains("string"));
        System.out.println(strContains);
        System.out.println("**************Equals***************");
        boolean strEquals= str5.equals("Practicing string methods");
        System.out.println(strEquals);
        System.out.println("**************EqualIgnoreCase***************");
        String country1="germany";
        String country2 = "Germany";
        System.out.println(country1.equalsIgnoreCase(country2));
        System.out.println("**************StartsWith***************");
        String sentence2="I love Miami";
        System.out.println(sentence2.startsWith("I love"));
        System.out.println("**************EndsWith***************");
        System.out.println(sentence2.endsWith("Miami"));
        System.out.println("**************Replace***************");
        String sentence3="We enjoy practicing Java String Methods";
        System.out.println(sentence3.replace("i","*"));
        System.out.println("**************Substring***************");
        String word1="Los Angeles";
                    //012345678910
        String subWord1=word1.substring(4);
        System.out.println(subWord1);
        String sub2Word1=word1.substring(word1.indexOf("L"),4);
        System.out.println(sub2Word1);
        System.out.println("**************Trim***************");
        String word2 = "    Hello World                  ";
        String trimmedWord2=word2.trim();
        System.out.println(word2);
        System.out.println(word2.trim());//Hello World      !
        System.out.println(word2);
        System.out.println(trimmedWord2);




    }
}
