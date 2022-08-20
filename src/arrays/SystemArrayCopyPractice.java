package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SystemArrayCopyPractice {
    /*
   int [] destination = new int[10];
   int [] source = new int[20];
   create an array and store users input of numbers into it(20)
   copy numbers from users input starting from input 5 till 15

    */
    public static void main(String[] args) {
        int [] source =new int[10];
        int [] destination = new int[10];
        destination[0]=1000;
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<source.length;i++){
            System.out.println("Please enter number #"+i);
            source[i]=scanner.nextInt();
        }
        System.out.println("Source: "+ Arrays.toString(source));
        System.arraycopy(source,5,destination,1,5);
        System.out.println("Destination: "+Arrays.toString(destination));
    }



}
