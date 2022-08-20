package wrapperClasses;

import java.util.Scanner;

public class Market {
    /*
    user scanner ask user to purchase some products in online market:

    Total = 1100

    Hi, make payment
    => 100$
    Do you want to make more purchases?(yes/no)

    total: 200
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer="";
        Integer total=0;
        do {
            System.out.println("Hi, how much is the amount?");
            String amount = scanner.next();
            amount=amount.replace("$","");
            total+=Integer.valueOf(amount);
            System.out.println("Do You Want To Continue?(Yes/No)");
            answer= scanner.next();

        }while (answer.equalsIgnoreCase("Yes"));
        System.out.println(total);
    }
}
