package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class CountOccurrence {
    /*
    count occurrence of letter in word
     */
    public static void main(String[] args) {
        String word = "techtorial";
        System.out.println(countOccurrence(word));
        int number = 121342323;
        System.out.println(countOccurrence(number));
        long longNum = 31245361;
        System.out.println(countOccurrence(longNum));
        String sentence = "Whether, you are working on a new cutting edge app or simply ramping up on new technology.";
        System.out.println(countOccurrence(getEachWord(sentence)));
        double[] numbers={12.45,13.45,11.23,12.45,100.50,0.5,11.23,5/2};
        System.out.println(countOccurrence(numbers));


    }

    static TreeMap<Character, Integer> countOccurrence(String word) {
        char[] letters = word.toCharArray();
        TreeMap<Character, Integer> countLetter = new TreeMap<>();//a,1,t=3,r=1
        for (char letter : letters) {
            if (countLetter.containsKey(letter)) {
                int count = countLetter.get(letter);//2
                countLetter.replace(letter, ++count);//t,3   replace or put will work
            } else {
                countLetter.put(letter, 1);//t,1; r=1
            }
        }
        return countLetter;
    }

    /*
    count occurrence of numbers
    method should accept int
    return map of its count
    ex: 121342323323
    out: {1=2,2=3,..}
     */
    static TreeMap<Integer, Integer> countOccurrence(int number) {
        TreeMap<Integer, Integer> result = new TreeMap<>();
        String[] numberStr = Integer.toString(number).split("");
        for (String num : numberStr) {
            Integer keyItem = Integer.valueOf(num);
            if (result.containsKey(keyItem)) {
                result.replace(keyItem, result.get(keyItem) + 1);
            } else {
                result.put(keyItem, 1);
            }
        }
        return result;
    }

    /*
    create method with will return array of digits of number
     31245361  ->[3,1,2,4,5,3,6,1]
    create method to count occurrence of each digit of number
    it will accept long data type and return TreeMap
    ex: 31245361  ->[3,1,2,4,5,3,6,1]
    {3=2,1=2,..}

     */
    static int[] getDigits(int number) {
        int[] result = new int[Integer.toString(number).length()];
        for (int i = 0; number != 0; number /= 10, i++) {
            int digit = number % 10;
            result[i] = digit;
        }
        return result;
    }

    static TreeMap<Integer, Integer> countOccurrence(long number) {
        TreeMap<Integer, Integer> result = new TreeMap<>();
        int[] numberArr = getDigits((int) number);
        for (int num : numberArr) {
            if (!result.containsKey(num)) {
                result.put(num, 1);
            } else {
                result.put(num, result.get(num) + 1);
            }
        }
        return result;
    }
    /*
    count occurrence of word in sentence

    ex: "Whether you are working on a new cutting edge app or simply
    ramping up on new technology, Java documentation has all the information you need
    to make your project a smashing success. Use the rich set of code samples, tutorials,
    developer guides, API documentation, and more to quickly develop your prototype and
    scale it up to a real world application."

    whether = 1
    you = 2
    are =3
     */
    public static String[] getEachWord(String sentence){
        String result=sentence.replace(".","").replace(",","");
        return result.split(" ");
    }
    static TreeMap<String,Integer> countOccurrence(String[] words){
        TreeMap<String,Integer> result=new TreeMap<>();

        for (String word:words){
            if (!result.containsKey(word)){
                result.put(word,1);
            }else {
                result.replace(word,result.get(word)+1);
            }
        }
        return result;
    }

    /*
    if decimal point number is occurring more than once, you should have value of true
    [12.5,24.1,12.5]
    {12.5=true,24.1=false}
     */
    static  TreeMap<Double,Boolean> countOccurrence(double[] numbers){
        TreeMap<Double,Boolean> result=new TreeMap<>();
        for (double number:numbers){
            if (!result.containsKey(number)){
                result.put(number,false);
            }else {
                result.replace(number,true);
            }
        }
        return result;
    }


}
