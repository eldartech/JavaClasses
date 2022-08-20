package methods.atm;

import java.util.Scanner;

public class TestATM {

    public static void main(String[] args) {
        ATM atm=new ATM();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bank");
        String answer ="";
        do {
            System.out.println("Select option:\n1.Deposit\n2.Withdraw\n3.Print Balance");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please enter the amount: ");

                    int amount = scanner.nextInt();
                    atm.deposit(amount);
                    break;
                case 2:
                    System.out.println("Please enter the amount: ");
                    int amount2 = scanner.nextInt();
                    atm.withdraw(amount2);
                    break;
                case 3:
                    System.out.println("Your balance is: ");
                    atm.printBalance();
                    break;
            }
            System.out.println("Do you want to continue?(Yes/No)");
            answer=scanner.next();
        }while (answer.equalsIgnoreCase("Yes"));
    }
}
