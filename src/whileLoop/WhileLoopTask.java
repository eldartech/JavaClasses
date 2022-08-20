package whileLoop;

import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter 1st number:");
        int num1 = input.nextInt();
        final int n = num1;
        System.out.println("Please enter 2nd number:");
        int num2 = input.nextInt();
        final int n2 = num2;
        int multipleOfNums=1;
        if (num1<num2){
            //20 10
            while (num1<=num2){
                multipleOfNums= multipleOfNums*num1++;
            }
        }else {
            while (num2<=num1){
                multipleOfNums*=num1--;
            }
        }
        System.out.println("Multiplication of all numbers in a range of "+n +" and "+n2+" is "+multipleOfNums);



    }
}
