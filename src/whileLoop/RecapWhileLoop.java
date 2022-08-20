package whileLoop;

import java.util.Scanner;

public class RecapWhileLoop {
    public static void main(String[] args) {
        int x =1;
        while(x<0){
            System.out.println("Inside of While Loop");
        }
        System.out.println("Out of While Loop");


        do {
            System.out.println("Inside of Do While Loop");
            x--;//0
        }while (x>=0);
        System.out.println("Out of Do While Loop");


    }
}
