package constructor.account;

public class Account {
    private String id;
    private String name;
    private double balance;
    static int count;

    Account( String name){
        this.name=name;
        ++count;
        setId();
    }

    Account( String name, double balance){
        this(name);
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    private void setId() {
        this.id = "A-000"+count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    double deposit(double amount){
        return balance+=amount;
    }

    double withdraw(double amount){
        if (amount<= balance){
            setBalance(balance-amount);
        }else {
            System.out.println("Amount exceeded the balance.");
        }
        return balance;
    }

    double transfer(Account accountTo,double amount){
        if (amount<=balance){
            setBalance(balance-amount);
            accountTo.deposit(amount);
        }else {
            System.out.println("Amount exceeded the balance.");
        }
        return balance;
    }

    @Override
    public String toString(){
        return "Account:\nID: "+ id+
       "\nName: "+ name+
        "\nBalance: $" + balance+
         "\n_________________________"
                ;
    }

}
