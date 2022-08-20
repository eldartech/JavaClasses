package stringIntro;

import java.util.Locale;

public class StringMethodPractice {
    public static void main(String[] args) {

        String str1 = "techtorial";

        System.out.println("length: "+str1.length());

        System.out.println("hello techtorial".length());

        System.out.println("===========================");

        String str2 = "Hello World";
        int str2Length = str2.length();
        System.out.println(str2+" has the length of: "+str2.length());
        // Hello World has the length of: 11

        System.out.println("===========================");

        String str3=str1+" "+str2;//techtorial+Hello World=techtorial Hello World
        System.out.println(str3);
        System.out.println("===========================");

        //concat()
        String str4= "Hello";//Hello techtorial
        System.out.println(str4.concat(" techtorial"));
        System.out.println(str4.concat(" "+str1));

        System.out.println("===========================");
        System.out.println(str1);//techtorial
        str1+=45;//str1=str1+45
        System.out.println(str1);

        System.out.println("===========================");
        String str5 = "Miami";//5
        //             01234
        char letterI=str5.charAt(4);
        char letterM=str5.charAt(0);
        System.out.println(""+letterI+letterM);
        System.out.println("===========================");

        String name1="Adam";
        String name2="Bob";
        String name3="Anna";
        String hello="Hello ";
        System.out.println(hello.concat(name1));
        System.out.println(hello+name2);
        System.out.println(hello+name3);

        System.out.println("===========================");

        String str6="Airport";
        int indexOfLetter = str6.indexOf("t");
        System.out.println(str6.indexOf("p"));
        System.out.println(indexOfLetter+10);

        System.out.println("===========================");
        String str7;
         str7 = "airport";
        System.out.println(str7.length());
        System.out.println("USB"+str7.substring(3)+"!");//USB port
        System.out.println(str7.substring(1,5));
        String str7Sub1=str7.substring(0,3);
        String str7Sub2=str7.substring(3);
        System.out.println(str7Sub1);
        System.out.println(str7Sub2);
        str7=str7Sub2+str7Sub1;
        System.out.println(str7);

        System.out.println("===========================");
    String upperCaseWord="WORLD";
        System.out.println(upperCaseWord.toLowerCase());











    }
}
