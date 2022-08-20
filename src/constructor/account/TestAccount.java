package constructor.account;

public class TestAccount {
    public static void main(String[] args) {
        Account account=new Account("Adam Johnson",1000.234);
        Account account2=new Account("Christopher Bale");
        Account account3=new Account("Bob Johnson");

        Account account4=new Account("Christopher Bale");
        Account account5=new Account("Bob Johnson",3534.345);

        System.out.println(account.toString());
        System.out.println(account.deposit(1000));
        System.out.println(account.withdraw(500));
        System.out.println(account);
        System.out.println(account2);
        System.out.println(account.transfer(account2,257.75));
        System.out.println(account2);
        System.out.println(account);

        System.out.println(account);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println(account5);


    }


}
