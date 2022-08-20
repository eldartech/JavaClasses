package whileLoop;

import java.util.Scanner;

public class ReverseNumber {
    /*
    using scanner
    - ask user to input number
    - print reversed number
    input: 1231
    output: 1321

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num=scanner.nextInt();
        int reversedNum=0;
        //    123
        while (num!=0){
            int digit = num%10;
            reversedNum=reversedNum*10+digit;
            num/=10;
//            System.out.println(reversedNum);
        }
        System.out.println(reversedNum);
    }
}
