package doWhileLoop;

import java.util.Scanner;

public class SumOfEnteredNums {
    /*
    ask user for a number
    add number(sum)
    ask user if he/she wants to continue
    y/n continue iteration
    for ex:
    12
    Y
    13
    N
    print : 25
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        char answer;

        do {
            System.out.println("Please enter a number to add");
            int num = scanner.nextInt();//12
            sum+=num;//12
            System.out.println("Do you want to continue? Y/N");//y
            answer=scanner.next().charAt(0);
        }while (answer=='Y' || answer=='y');
        System.out.println(sum);
    }


}
