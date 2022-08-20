package arrays;

import methods.TestMethods;

import java.util.Arrays;

import static methods.IntroToJavaMethodCreation.sumOfNumber;

public class WarmUp extends TestMethods {
    public static void main(String[] args) {

        int ids[], types;
        String str  = "Hello";
        String str3 = "World";
        String[] strs = {"Hello","World"};
        //             0

        char[] letters = {'H','O','L','L','O'};
        letters[0]='B';
        System.out.println("String method: "+str.charAt(0));
        System.out.println("Array index provided: "+letters[0]);
        String str2= new String(letters);
        System.out.println(str2);
        System.out.println(Arrays.toString(letters));
        ids=new int[3];
        types=3;
        String[] strings = { "stringValue" };  //creates array of String data type
        Object[] objects = strings;  //doesn’t require a cast because Object is a broader type than String

        String[] againStrings = (String[]) objects;  //a cast is needed because we are moving to a more specific type
        int [][] ddArr = new int[2][3];
        ddArr[0][0]=1;
        ddArr[0][1]=5;
        ddArr[0][2]=4;
        ddArr[1][0]=5;
        ddArr[1][1]=6;

        /*{
        {1,5,4},
        {5,6,0}
         */

        Arrays.sort(ddArr[0]);
        Arrays.sort(ddArr[1]);
        System.out.println(Arrays.deepToString(ddArr));

        /*1  2  3
        1
        2
        3

         */
        String str10 = "Java+is+easy+Java+is+easy";
        String[] words = str10.split("\\+");//regular expression
        // \, |, ^, *, +
        System.out.println(Arrays.toString(words));
        String[] words2=str10.split("\\+",3);//[Java, is, easy+Java+is+easy]
        System.out.println(Arrays.toString(words2));
        String word = "/Library/Java/JavaVirtualMachines/jdk-11.0.13.jdk/Contents/Home/bin/java";
        word=word.replace("/","|");
        String[] wordPipe=word.split("\\|");
        System.out.println(Arrays.toString(wordPipe));
        String path = "/Users/techtorialacademy/IdeaProjects/JavaClasses/src/arrays/ArrayInterviews.java";
        System.out.println(Arrays.toString(path.split("/")));
        System.out.println(Arrays.toString(str10.split("i")));
        System.out.println(Arrays.toString(word.split("[|.-]")));

    }
}
