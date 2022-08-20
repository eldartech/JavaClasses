package ifElseStatement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfElseTask2 {
    /*use Scanner
    - ask user to input word
    - print out if fist letter is capital letter or not
    Hint: charAt() and ASCII values of chars
    charAt(word.length()-1)
10-1
9
5-1
4-> 01234
2-1
1
     */


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word=scanner.next();
        char firstLetter=word.charAt(0);
        char lastLetter=word.charAt(word.length()-1);
        if(firstLetter>64 && firstLetter<91){
            System.out.println(firstLetter+" is capital.");
        }else{
            System.out.println(firstLetter+" is not capital.");
        }

        if (lastLetter>=33 && lastLetter<=64){
            System.out.print(lastLetter+" is special character.");
        }else {
            System.out.println(lastLetter+" is not special character.");
        }

    }
}
