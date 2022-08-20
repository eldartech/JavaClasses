package arrays;

import java.util.Scanner;

public class SplitSystemArrayCopy {
    public static void main(String[] args) {
        System.out.println("Enter 10 words:");
        Scanner input = new Scanner(System.in);
        String []words = new String[10];
        for(int i=0; i<words.length;i++){
            words[i]=input.next();
        }
        String[] array1= new String[words.length/2];
        String[] array2  = new String[words.length-array1.length];
        System.arraycopy(words,0,array1,0,array1.length);
        System.arraycopy(words,array1.length,array2,0,array2.length);
       int y=0;
        System.out.println("While Loop Print Out");
        while (y< array1.length){
            System.out.println(array1[y++]);
        }
        System.out.println("DO While Print out");
        int k=0;
        do {
            System.out.println(array2[k++]);
        }while (k< array2.length);

     }
}
