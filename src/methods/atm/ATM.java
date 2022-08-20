package methods.atm;

public class ATM {
    int balance;

    void deposit(int amount){
        balance=balance+amount;
    }

    void withdraw(int amount){
        balance-=amount;
    }

    void printBalance(){
        System.out.println(balance);
    }
}
