package arrayList;

import java.util.ArrayList;

public class ArrayListLetterOrDigit {
    /*
    List storing any value
    ints, and chars
    method to check if it is letter or number
    print number method -> isDigit
    print letter method -> isLetter
    List list = new ArrayList();
    list.add(1)
    list.add('A')
    list.add(2)

     */
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList();
        list.add('1');
        list.add('A');
        list.add('2');
        list.add('a');
        printDigits(list);
        printLetters(list);
        String word="2020 was not a good year";
        printLetters(word);
        printDigits(word);


    }
    static void printLetters(ArrayList<Character> list){
        System.out.println("Letters:");
        for (int i=0; i<list.size();i++){
            if (isAlphabetic(list.get(i))){
                System.out.println(list.get(i));
            }
        }
    }

    static void printDigits(ArrayList<Character> list){
        System.out.println("Digits:");
        for (int i=0; i< list.size();i++){
            if (isDigit(list.get(i))){
                System.out.println(list.get(i));
            }
        }
    }

    static boolean isDigit(char character){
        if (character>='0'&&character<='9'){
            return true;
        }
        return false;
    }
    static boolean isAlphabetic(char character){
        if ((character>='A'&& character<='Z')||(character>='a' && character<='z')){
            return true;
        }
        return false;
    }

    static void printDigits(String word){
        System.out.println("Digits of word:");
        for (int i=0;i<word.length();i++){
            if (Character.isDigit(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
        }
    }

    static void printLetters(String word){
        System.out.println("Letters of word:");
        for(int j=0;j<word.length();j++){
            if (Character.isLetter(word.charAt(j))){
                System.out.println(word.charAt(j));
            }
        }
    }

}
